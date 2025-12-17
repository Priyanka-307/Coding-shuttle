package com.example.CoffeeShop.Milk;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("AlmondMilk")
public class AlmondMilk implements Milk{

    @Override
    public String get_milk() {
        return "Almond Milk";
    }
}
