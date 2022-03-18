package Patterns.Creational.AbstractFactory.AnimalFamily;

public class Duck implements Animal {
    @Override
    public String getAnimalType() {
        return "Duck";
    }

    @Override
    public String getAnimalSound() {
        return "QUACK";
    }
}
