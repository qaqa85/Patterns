package Patterns.Creational.AbstractFactory;

import Patterns.Creational.AbstractFactory.AnimalFamily.Animal;
import Patterns.Creational.AbstractFactory.Factory.AbstractFactory;
import Patterns.Creational.AbstractFactory.Factory.AnimalType;
import Patterns.Creational.AbstractFactory.Factory.FactoryProvider;
import Patterns.Creational.AbstractFactory.Factory.FactoryType;

public class demo {
    public static void main(String[] args) {
        AbstractFactory normalAnimals = FactoryProvider.getFactory(FactoryType.ANIMALS);
        Animal dog = normalAnimals.create(AnimalType.DOG);
        Animal duck = normalAnimals.create(AnimalType.DUCK);

        AbstractFactory smallAnimals = FactoryProvider.getFactory(FactoryType.SMALL_ANIMALS);
        Animal dog1 = smallAnimals.create(AnimalType.DOG);
        Animal duck1 = smallAnimals.create(AnimalType.DUCK);

        System.out.println(dog.getAnimalSound());
        System.out.println(duck.getAnimalSound());
        System.out.println(dog1.getAnimalSound());
        System.out.println(duck1.getAnimalSound());
    }
}
