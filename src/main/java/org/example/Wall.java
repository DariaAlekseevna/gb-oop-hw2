package org.example;

public class Wall {

    private Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    public void jump(String name, Integer nameHeight) {
        if (nameHeight >= height) {
            System.out.println(name + " успешно перепрыгнул " + height + " см");
        } else {
            System.out.println(name + " не смог перепрыгнуть");

        }
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
