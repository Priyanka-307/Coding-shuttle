package com.example.StartingWithSpring.Starting.with.Spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    public final CalculatorService calculator;
    public final ConsoleIO io;

    public DemoRunner(CalculatorService calc, ConsoleIO console){
        this.calculator = calc;
        this.io = console;
    }

    @Override
    public void run(String... args) throws Exception {
        int a = (io.readInt("Enter first number: "));
        int b = (io.readInt("Enter second number: "));

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Mutilplication " + calculator.multiply(a, b));
    }
}
