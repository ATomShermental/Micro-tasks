package org.example.abstractFactory.adidas;

import org.example.abstractFactory.models.Sneakers;

public class AdidasSneakers implements Sneakers {

    @Override
    public void putOn(){
        System.out.println("Adidas sneakers on");
    }
}
