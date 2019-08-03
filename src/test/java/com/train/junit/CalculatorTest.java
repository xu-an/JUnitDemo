package com.train.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        assertEquals(3, new Calculator().add(1, 2));
    }

    @Test
    public void evaluatesSumExpressionSimple() {
      Calculator calculator = new Calculator();
      int sum = calculator.evaluate("1+1");
      assertEquals(2, sum);
    }

    @Test
    public void evaluatesSumExpressionComplex() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}