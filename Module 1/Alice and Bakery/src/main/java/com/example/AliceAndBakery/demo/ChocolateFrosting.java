package com.example.AliceAndBakery.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting{

    @Override
    public String get_Frosting() {
        return "Chocolate Frosting";
    }


}
