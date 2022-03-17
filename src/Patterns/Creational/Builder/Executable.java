package Patterns.Creational.Builder;

class Executable {
    public static void main(String[] args) {
        Entity entity = new Entity.Builder("Like", "Knoppers")
                .age(10)
                .salary(3000)
                .build();

        System.out.println(entity);
    }
}
