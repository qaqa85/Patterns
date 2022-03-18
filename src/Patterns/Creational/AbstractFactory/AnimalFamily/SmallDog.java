package Patterns.Creational.AbstractFactory.AnimalFamily;

public class SmallDog implements Animal{
    @Override
    public String getAnimalType() {
        return "Small dog";
    }

    @Override
    public String getAnimalSound() {
        return "woof";
    }
}
