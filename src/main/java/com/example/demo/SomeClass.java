package com.example.demo;

import reactor.core.publisher.Mono;

public class SomeClass {
    public Mono<String> someMethod() {
        // 假设这里返回一个Mono对象
        return Mono.just("Hello, World!");
    }
}
