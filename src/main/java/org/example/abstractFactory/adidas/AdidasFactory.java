package org.example.abstractFactory.adidas;

import org.example.abstractFactory.AbstractFactory;
import org.example.abstractFactory.models.Sneakers;
import org.example.abstractFactory.models.TShirt;

public class AdidasFactory implements AbstractFactory {
    @Override
    public Sneakers createSneakers() {
        return new AdidasSneakers();
    }

    @Override
    public TShirt createTShirt() {
        return new AdidasTShirt();
    }
}
