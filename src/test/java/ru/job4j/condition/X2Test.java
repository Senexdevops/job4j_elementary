package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class X2Test {

    @Test
    void whenA1B1C1X1Then3() {
        int a = 1, b = 1, c = 1, x = 1;
        int expected = 3;
        int result = X2.calc(a, b, c, x);
        assertEquals(expected, result);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int a = 0, b = 1, c = 1, x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertEquals(expected, result);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a = 1, b = 1, c = 0, x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertEquals(expected, result);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int a = 1, b = 1, c = 1, x = 0;
        int expected = 1;
        int result = X2.calc(a, b, c, x);
        assertEquals(expected, result);
    }
}
