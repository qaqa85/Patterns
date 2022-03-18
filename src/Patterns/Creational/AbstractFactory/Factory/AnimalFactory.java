package Patterns.Creational.AbstractFactory.Factory;

import Patterns.Creational.AbstractFactory.AnimalFamily.Animal;
import Patterns.Creational.AbstractFactory.AnimalFamily.Dog;
import Patterns.Creational.AbstractFactory.AnimalFamily.Duck;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Animal create(AnimalType animalType) {
        if (animalType == AnimalType.DOG) {
            return new Dog();
        } else if (animalType == AnimalType.DUCK) {
            return new Duck();
        }
        return null;
    }
}
