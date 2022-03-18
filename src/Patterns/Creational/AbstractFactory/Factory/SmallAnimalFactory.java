package Patterns.Creational.AbstractFactory.Factory;

import Patterns.Creational.AbstractFactory.AnimalFamily.Animal;
import Patterns.Creational.AbstractFactory.AnimalFamily.SmallDog;
import Patterns.Creational.AbstractFactory.AnimalFamily.SmallDuck;

public class SmallAnimalFactory implements AbstractFactory {
    @Override
    public Animal create(AnimalType animalType) {
        if (animalType == AnimalType.DOG) {
            return new SmallDog();
        } else if (animalType == AnimalType.DUCK) {
            return new SmallDuck();
        }
        return null;
    }
}
