package com.example.CoffeeShop.CoffeeBean;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RobustaBean")
public class RobustaBean implements CoffeeBean{

    public String get_bean(){

        return "Robusta Bean";
    }
}
