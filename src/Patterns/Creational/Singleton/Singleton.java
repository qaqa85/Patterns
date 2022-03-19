package Patterns.Creational.Singleton;

class Singleton {
    private static final Object singleton = new Object();

    public static Object getInstance() {
        return singleton;
    }
}
