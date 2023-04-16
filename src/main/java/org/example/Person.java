package org.example;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(name +" бежит");
    }
    void jump(){
        System.out.println(name + " прыгнул");
    }
}
