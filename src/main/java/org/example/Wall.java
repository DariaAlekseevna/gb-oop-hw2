package org.example;

public class Wall {

    private Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    /**
     * @param name       - имя прыгуна
     * @param nameHeight - максимальная высота, которую может перепрыгнуть прыгун
     * @return - boolean в зависимости от того, смог ли прыгун перепрыгнуть высоту стены
     */
    public boolean jump(String name, Integer nameHeight) {
        if (nameHeight >= height) {
            System.out.println(name + " успешно перепрыгнул " + height + " см");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть");
            return false;
        }
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
