package com.train.junit;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // 这里只是最简单的测试demo，暂不做容错处理
        return a / b;
    }

    
    public int evaluate(String expression) {
      int sum = 0;
      for (String summand : expression.split("\\+"))
        sum += Integer.valueOf(summand);
      return sum;
    }
}