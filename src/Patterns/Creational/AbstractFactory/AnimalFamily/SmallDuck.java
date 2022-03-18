package Patterns.Creational.AbstractFactory.AnimalFamily;

public class SmallDuck implements Animal{
    @Override
    public String getAnimalType() {
        return "Small duck";
    }

    @Override
    public String getAnimalSound() {
        return "quack";
    }
}
