package org.example.abstractFactory.nike;

import org.example.abstractFactory.AbstractFactory;
import org.example.abstractFactory.models.Sneakers;
import org.example.abstractFactory.models.TShirt;

public class NikeFactory implements AbstractFactory {
    @Override
    public Sneakers createSneakers() {
        return new NikeSneakers();
    }

    @Override
    public TShirt createTShirt() {
        return new NikeTShirt();
    }
}
