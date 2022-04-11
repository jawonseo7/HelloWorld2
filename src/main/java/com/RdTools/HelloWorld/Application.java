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

        log.info("Start Application: args: {}", args);
        SpringApplication.run(Application.class, args);
    }
}
