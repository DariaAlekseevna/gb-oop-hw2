package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Vova", 1500, 150);
        Person person2 = new Person("Toma", 600, 120);
        person1.jump();
        person1.run();
        person2.jump();
        person2.run();

        Cat cat1 = new Cat("Pushok", 450, 200);
        Cat cat2 = new Cat("Murzik", 850, 250);
        cat1.jump();
        cat1.run();
        cat2.jump();
        cat2.run();

        Robot robot1 = new Robot("R2-D2", 10_000, 0);
        Robot robot2 = new Robot("C-3PO", 8000, 50);
        robot1.jump();
        robot1.run();
        robot2.jump();
        robot2.run();

        ArrayList members = new ArrayList();
        members.add(person1);
        members.add(person2);
        members.add(cat1);
        members.add(cat2);
        members.add(robot1);
        members.add(robot2);

        RunningTrack runningTrack1 = new RunningTrack(500);
        RunningTrack runningTrack2 = new RunningTrack(800);
        Wall wall1 = new Wall(50);
        Wall wall2 = new Wall(100);
        Wall wall3 = new Wall(200);

        System.out.println();

        ArrayList obstacles = new ArrayList<>();
        obstacles.add(runningTrack1);
        obstacles.add(runningTrack2);
        obstacles.add(wall1);
        obstacles.add(wall2);
        obstacles.add(wall3);

        boolean b = true;
        for (int j = 0; j < members.size(); j++) {
            b = true;
            for (int i = 0; i < obstacles.size(); i++) {
                if ((obstacles.get(i) instanceof RunningTrack) && (b)) {
                    if (members.get(j) instanceof Person) {
                        b = ((RunningTrack) obstacles.get(i)).run(((Person) members.get(j)).getName(),
                                ((Person) members.get(j)).getDist());

                    } else if ((members.get(j) instanceof Cat)) {
                        b = ((RunningTrack) obstacles.get(i)).run(((Cat) members.get(j)).getName(),
                                ((Cat) members.get(j)).getDist());
                    } else if (((members.get(j) instanceof Robot))) {
                        b = ((RunningTrack) obstacles.get(i)).run(((Robot) members.get(j)).getName(),
                                ((Robot) members.get(j)).getDist());
                    }
                } else if ((obstacles.get(i) instanceof Wall) && (b)) {
                    if (members.get(j) instanceof Person) {
                        b = ((Wall) obstacles.get(i)).jump(((Person) members.get(j)).getName(),
                                ((Person) members.get(j)).getJumpHeight());
                    } else if ((members.get(j) instanceof Cat)) {
                        b = ((Wall) obstacles.get(i)).jump(((Cat) members.get(j)).getName(),
                                ((Cat) members.get(j)).getJumpHeight());
                    } else if (((members.get(j) instanceof Robot))) {
                        b = ((Wall) obstacles.get(i)).jump(((Robot) members.get(j)).getName(),
                                ((Robot) members.get(j)).getJumpHeight());
                    }
                }
            }
        }
    }
}