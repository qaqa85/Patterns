package Patterns.Creational.AbstractFactory.Factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if(factoryType == FactoryType.SMALL_ANIMALS) {
            return new SmallAnimalFactory();
        } else if (factoryType == FactoryType.ANIMALS) {
            return new AnimalFactory();
        }
        return null;
    }
}
