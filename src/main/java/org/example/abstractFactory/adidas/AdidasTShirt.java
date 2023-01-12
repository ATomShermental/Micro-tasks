package org.example.abstractFactory.adidas;

import org.example.abstractFactory.models.TShirt;

public class AdidasTShirt implements TShirt {

    @Override
    public void putOn(){
        System.out.println("Adidas TShirt on");
    }
}
