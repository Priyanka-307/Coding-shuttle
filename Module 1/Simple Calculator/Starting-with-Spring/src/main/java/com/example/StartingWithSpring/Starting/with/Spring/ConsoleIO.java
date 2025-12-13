package com.example.StartingWithSpring.Starting.with.Spring;


import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleIO {
    public final Scanner sc =  new Scanner(System.in);

    public int readInt(String prompt){
        System.out.println(prompt);
        return sc.nextInt();
    }
}
