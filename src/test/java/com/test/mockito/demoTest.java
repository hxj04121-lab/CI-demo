package com.test.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class demoTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        demo calculator = new demo();

        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldAddNegativeNumbers() {
        demo calculator = new demo();

        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void shouldAddZeroWithoutChangingTheOtherNumber() {
        demo calculator = new demo();

        assertEquals(7, calculator.add(7, 0));
    }
}
