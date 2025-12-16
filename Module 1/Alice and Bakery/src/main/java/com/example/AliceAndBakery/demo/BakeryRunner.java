package com.example.AliceAndBakery.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BakeryRunner implements CommandLineRunner {

    Cakebaker cake;
    BakeryRunner(Cakebaker cb){
        this.cake=cb;
    }

    @Override
    public void run(String... args) throws Exception {
        cake.BakeCake();
    }
}
