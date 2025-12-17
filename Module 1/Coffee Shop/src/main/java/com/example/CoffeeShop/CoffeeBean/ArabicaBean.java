package com.example.CoffeeShop.CoffeeBean;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ArabicaBean")
public class ArabicaBean implements CoffeeBean{

    public String get_bean(){
        return "Arabica Bean";
    }
}
