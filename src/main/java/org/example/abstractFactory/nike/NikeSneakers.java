package org.example.abstractFactory.nike;

import org.example.abstractFactory.models.Sneakers;

public class NikeSneakers implements Sneakers {

    @Override
    public void putOn(){
        System.out.println("Nike sneakers on");
    }

}
