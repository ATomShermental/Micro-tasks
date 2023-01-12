package org.example.abstractFactory.nike;

import org.example.abstractFactory.models.TShirt;

public class NikeTShirt implements TShirt {

    @Override
    public void putOn(){
        System.out.println("Nike TShirt on");
    }
}

