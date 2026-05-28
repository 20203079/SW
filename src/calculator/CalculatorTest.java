package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {
    private static Calculator calc;

    @BeforeAll
    static void setUpBeforeClass() {
        calc = new Calculator();
    }

    @Test
    @Order(1)
    void testAdd() {
        assertEquals(5, calc.calculate(2, "+", 3));
    }

    @Test
    @Order(2)
    void testAddNegative() {
        assertEquals(-1, calc.calculate(2, "+", -3));
    }

    @Test
    @Order(3)
    void testMinus() {
        assertEquals(1, calc.calculate(3, "-", 2));
    }

    @Test
    @Order(4)
    void testMinusNegative() {
        assertEquals(-5, calc.calculate(3, "-", 8));
    }

    @Test
    @Order(5)
    void testDiv() {
        assertEquals(2, calc.calculate(6, "/", 3));
    }

    @Test
    @Order(6)
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> calc.calculate(6, "/", 0));
    }

    @Test
    @Order(7)
    void testMultiply() {
        assertEquals(6, calc.calculate(2, "*", 3));
    }

    @Test
    @Order(8)
    void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> calc.calculate(6, "%", 3));
    }
}