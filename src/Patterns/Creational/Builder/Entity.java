package Patterns.Creational.Builder;

class Entity {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int salary;

    //constructor
    Entity(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    static final class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private int salary;

        Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        Builder age(int age) {
            this.age = age;
            return this;
        }

        Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        Entity build() {
            Entity entity = new Entity(this);
            //We can make validation here
            return entity;
        }
    }
}
