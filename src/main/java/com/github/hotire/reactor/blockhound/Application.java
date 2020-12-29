package com.github.hotire.reactor.blockhound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        ReactorDebugAgent.init(); -> DebugAgentEnvironmentPostProcessor
        SpringApplication.run(Application.class, args);
    }

}
