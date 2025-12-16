package com.example.AliceAndBakery.demo;


import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting{

    @Override
    public String get_Frosting() {
        return "Strawberry Frosting";
    }
}
