package org.example.abstractFactory;

import org.example.abstractFactory.models.Sneakers;
import org.example.abstractFactory.models.TShirt;

public interface AbstractFactory {

    public Sneakers createSneakers();

    public TShirt createTShirt();

}
