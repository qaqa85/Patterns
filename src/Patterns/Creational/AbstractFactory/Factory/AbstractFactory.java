package Patterns.Creational.AbstractFactory.Factory;

import Patterns.Creational.AbstractFactory.AnimalFamily.Animal;

public interface AbstractFactory {
    Animal create(AnimalType animalType);
}
