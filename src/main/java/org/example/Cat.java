package org.example;

public class Cat {
    private String name;
    private Integer dist;
    private Integer jumpHeight;

    public Cat(String name, Integer dist, Integer jumpHeight) {
        this.name = name;
        this.dist = dist;
        this.jumpHeight = jumpHeight;
    }

    void run(){
        System.out.println(name +" бежит дистанцию " + dist + " метров" );
    }
    void jump(){
        System.out.println(name + " прыгнул с высотой " + jumpHeight + " см");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDist() {
        return dist;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public Integer getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(Integer jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
