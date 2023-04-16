package org.example;

public class RunningTrack {
    private Integer length;

    public RunningTrack(Integer length) {
        this.length = length;
    }

    public void run(String name, Integer nameDist) {
        if (nameDist >= length) {
            System.out.println(name + " успешно пробежал " + length + " метров");
        } else {
            System.out.println(name + " не смог пробежать");

        }
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
