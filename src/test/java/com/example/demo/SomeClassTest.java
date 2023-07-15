package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.*;

public class SomeClassTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeClassTest.class);
    @Test
    public void testAnother() {
        Mono<Object> mono = Mono.fromRunnable(() -> {
            LOGGER.info("这里执行第一次");
        });

        mono.subscribe();

        StepVerifier.create(mono)
                    .expectSubscription()
                    .verifyComplete();

    }
    public void testSomeMethod() {
        // 创建一个模拟对象
        SomeClass someClassMock = mock(SomeClass.class);
        when(someClassMock.someMethod()).thenReturn(Mono.just("Hello, mock!"));

        // 调用被测试方法
        Mono<String> mono = someClassMock.someMethod();
        mono.subscribe();

        // 验证方法是否被调用过
        verify(someClassMock).someMethod();


        // 验证返回的Mono是否被订阅过
        StepVerifier.create(mono)
                    .expectSubscription()
                    .verifyComplete();
    }
}
