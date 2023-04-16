package org.example;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(name+" бежит");
    }
    void jump(){
        System.out.println(name +" прыгнул");
    }
}
