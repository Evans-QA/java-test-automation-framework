package com.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @Test
    void myFirstTest() {
        int result = sum(3, 3);
        Assertions.assertEquals(9, result);

    }
static int sum(int a, int b) {
        return a * b;
    }
}
