package com.example.AliceAndBakery.demo;


import org.springframework.stereotype.Service;

@Service
public class Cakebaker {

    Frosting frosting;
    Syrup syrup;

    Cakebaker(Frosting f, Syrup s){
        this.frosting = f;
        this.syrup = s;
    }

    public void BakeCake(){
        System.out.print("Baking a cake with "+ frosting.get_Frosting() + " and "+ syrup.get_Syrup());
    }
}
