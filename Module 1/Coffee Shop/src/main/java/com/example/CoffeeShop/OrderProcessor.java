package com.example.CoffeeShop;

import com.example.CoffeeShop.Maker.Maker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessor implements CommandLineRunner {

        Maker maker;
        OrderProcessor(Maker m){
            this.maker = m;
        }

    @Override
    public void run(String... args) throws Exception {
        maker.MakingBeverage();
    }
}
