package com.javarush;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeAll
    static void example1() {
        System.out.println("START ALL");
    }
    @AfterAll
    static void example2() {
        System.out.println("END ALL");
    }
    @BeforeEach
    void example3() {
        System.out.println("START COUNTING");
    }
    @AfterEach
    void example4() {
        System.out.println("END COUNTING");
    }

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
        int result = calc.mul(3, 4);
        assertEquals(12, result);
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        int result = calc.div(20, 3);
        assertEquals(6, result);
    }
}