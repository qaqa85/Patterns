package Patterns.Creational.Singleton;

class demo {
    public static void main(String[] args) {
        Object object1 = Singleton.getInstance();
        Object object2 = Singleton.getInstance();
        Object object = new Object();
        System.out.println(object1);
        System.out.println(object2);
        //last got different address
        System.out.println(object);
    }
}
