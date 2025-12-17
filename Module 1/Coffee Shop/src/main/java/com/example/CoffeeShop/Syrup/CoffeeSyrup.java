package com.example.CoffeeShop.Syrup;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CoffeeSyrup")
public class CoffeeSyrup implements Syrup{

    @Override
    public String get_Syrup() {
        return "Coffee Syrup";
    }
}
