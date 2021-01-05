package com.github.hotire.reactor.blockhound;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RequestMapping("/debug")
@RestController
public class ReactorDebugAgentController {

    @GetMapping("/error")
    public Mono<String> error() {
        return Mono.just(1).map(i -> i + 1).flatMap(it -> Mono.error(new RuntimeException()));
    }
}
