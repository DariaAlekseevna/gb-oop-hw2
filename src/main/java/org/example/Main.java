package org.example;
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Vova");
        Person person2 = new Person("Toma");

        Cat cat1 = new Cat("Pushok");
        Cat cat2 = new Cat("Murzik");

        Robot robot1 = new Robot("R2-D2");
        Robot robot2 = new Robot("C-3PO");

        person1.run();
        person2.jump();

    }
}