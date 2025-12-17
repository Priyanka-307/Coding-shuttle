package com.example.CoffeeShop.Maker;

import com.example.CoffeeShop.CoffeeBean.CoffeeBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "Maker.type", havingValue = "EspressoMaker")
public class EspressoMaker implements Maker{

    CoffeeBean bean;

    EspressoMaker(@Qualifier("RobustaBean") CoffeeBean cf){
        this.bean = cf;
    }

    public void MakingBeverage(){
        System.out.println("Preparing Espresso with " + bean.get_bean());
    }
}
