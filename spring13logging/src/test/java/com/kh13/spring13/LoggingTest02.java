package com.kh13.spring13;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class LoggingTest02 {

    @Test
    public void test() {
        //엄청나게 많은 로그를 출력한다면?,,,
        for(int i=0; i < 10000000; i++) {
            log.debug("Hello world!");
        }
    }
}
