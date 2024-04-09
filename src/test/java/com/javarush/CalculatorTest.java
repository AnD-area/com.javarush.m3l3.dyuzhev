package com.javarush;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    void sub() {
        Calculator calc = new Calculator();
        int result = calc.sub(20, 10);
        assertEquals(10, result);
    }

    @Test
    void mul() {
        Calculator calc = new Calculator();
        int result = calc.mul(3, 14);
        assertEquals(12, result);
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        int result = calc.div(20, 3);
        assertEquals(6, result);
    }
}