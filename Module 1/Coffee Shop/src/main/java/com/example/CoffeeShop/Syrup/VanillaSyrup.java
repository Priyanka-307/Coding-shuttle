package com.example.CoffeeShop.Syrup;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("VanillaSyrup")
public class VanillaSyrup implements Syrup{

    public String get_Syrup(){
        return "Vanilla Syrup";
    }
}
