package com.example.StartingWithSpring.Starting.with.Spring;


import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
}
