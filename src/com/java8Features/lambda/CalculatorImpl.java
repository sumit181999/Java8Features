package com.java8Features.lambda;

import com.java8Features.lambda.Calculator;

public class CalculatorImpl{

//    @Override
//    public void method1() {
//        System.out.print("ssdfdsds");
//    }

    public static void main(String[] args) {
        Calculator c = (t1, t2) -> t2-t1;
        System.out.println(c.method1(12,13));
    }
}
