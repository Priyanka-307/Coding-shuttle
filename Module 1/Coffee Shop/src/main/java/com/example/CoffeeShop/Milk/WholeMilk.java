package com.example.CoffeeShop.Milk;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("WholeMilk")
public class WholeMilk implements Milk{

    @Override
    public String get_milk() {
        return "Whole Milk";
    }
}
