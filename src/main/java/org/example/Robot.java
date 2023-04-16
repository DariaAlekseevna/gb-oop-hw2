package org.example;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(name+" бежит");
    }
    void jump(){
        System.out.println(name +" прыгнул");
    }
}
