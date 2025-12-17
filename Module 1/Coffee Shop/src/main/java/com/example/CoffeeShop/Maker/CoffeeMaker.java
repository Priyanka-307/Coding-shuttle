package com.example.CoffeeShop.Maker;

import com.example.CoffeeShop.CoffeeBean.CoffeeBean;
import com.example.CoffeeShop.Milk.Milk;
import com.example.CoffeeShop.Syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "Maker.type", havingValue = "CoffeeMaker")
public class CoffeeMaker implements Maker{

    CoffeeBean bean;
    Milk milk;
    Syrup syrup;

    CoffeeMaker(@Qualifier("ArabicaBean") CoffeeBean cf, @Qualifier("WholeMilk") Milk m, @Qualifier("VanillaSyrup") Syrup s){
        this.bean = cf;
        this.milk = m;
        this.syrup = s;
    }

    public void MakingBeverage(){
        System.out.println("Preparing Latte with " + bean.get_bean() + ", " + milk.get_milk() + " and " + syrup.get_Syrup());
    }
}
