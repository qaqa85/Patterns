package Patterns.Creational.AbstractFactory.AnimalFamily;

public class Dog implements Animal{
    @Override
    public String getAnimalType() {
        return "Dog";
    }

    @Override
    public String getAnimalSound() {
        return "WOOF!";
    }
}
