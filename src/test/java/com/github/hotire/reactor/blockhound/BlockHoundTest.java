package com.github.hotire.reactor.blockhound;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import reactor.blockhound.BlockHound;
import reactor.core.publisher.Mono;

class BlockHoundTest {

    @Test
    void test() {
        BlockHound.install();
        assertThatThrownBy(() -> Mono.delay(Duration.ofSeconds(1))
                                                .doOnNext(it -> {
                                                    try {
                                                        Thread.sleep(10);
                                                    } catch (InterruptedException e) {
                                                        throw new RuntimeException(e);
                                                    }
                                                })
                                     .block())
                .isInstanceOf(RuntimeException.class);
    }
}
