package com.company.creatures;

import com.company.creatures.Animal;
import com.company.creatures.Edible;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {

    }
}
