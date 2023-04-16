package org.example;

public class RunningTrack {
    private Integer length;

    public RunningTrack(Integer length) {
        this.length = length;
    }

    /**
     * @param name     - имя бегуна
     * @param nameDist - дистанция, которую максимально может пробежать бегун
     * @return - boolean в зависимости смог или нет пробежать бегун дистанцию дорожки
     */
    public boolean run(String name, Integer nameDist) {
        if (nameDist >= length) {
            System.out.println(name + " успешно пробежал " + length + " метров");
            return true;
        } else {
            System.out.println(name + " не смог пробежать");
            return false;
        }
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
