package com.RdTools.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;

//@EnableJpaAuditing
@Log4j2
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }

    @GetMapping(value="/log")
    public void log() throws Exception {

        //FATAL, ERROR, WARN, INFO, DEBUG, TRACE
        log.fatal("FATAL");
        log.error("ERROR");
        log.warn("WARN");
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("TRACE");
    }
}
