package com.github.hotire.reactor.blockhound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.blockhound.BlockHound;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BlockHound.install();
        SpringApplication.run(Application.class, args);
    }

}
