package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleNumberCalculatorTest {

    private TriangleNumberCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new TriangleNumberCalculator();
    }

    @Test
    public void testValue() {
        assertEquals(0, calc.value(0), "T(0) should be 0");
        assertEquals(1, calc.value(1), "T(1) should be 1");
        assertEquals(3, calc.value(2), "T(2) should be 3");
        assertEquals(6, calc.value(3), "T(3) should be 6");
        assertEquals(10, calc.value(4), "T(4) should be 10");
        assertEquals(15, calc.value(5), "T(5) should be 15");
    }

    @Test
    public void testAdd() {
        assertEquals(9, calc.add(2, 3), "T(2) + T(3) should be 9"); // 3 + 6
        assertEquals(4, calc.add(2, 1), "T(2) + T(1) should be 4"); // 3 + 1
        assertEquals(36, calc.add(5, 6), "T(5) + T(6) should be 21"); // 15 + 6? We'll calculate properly
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calc.subtract(3, 2), "T(3) - T(2) should be 3"); // 6 - 3
        assertEquals(3, calc.subtract(2, 0), "T(2) - T(0) should be 3"); // 3 - 0
    }
}
