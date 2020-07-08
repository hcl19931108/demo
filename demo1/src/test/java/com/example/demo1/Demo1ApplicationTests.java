package com.example.demo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void add(){
        int a = 1+1;
        System.out.println(a);
        Assertions.assertTrue(a>0);
        Assertions.assertEquals(a,3);
    }
}
