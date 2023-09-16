package org.example.lesson5.task2.paticipant;

import lombok.*;
import org.example.lesson5.task2.obstacle.*;

@Getter
@Setter
@AllArgsConstructor
public class Robot extends Participant {
    // all static values are displayed in centimeters
    private static final int MAX_ROBOT_RUNNING_DISTANCE = 1500;
    private static final int MAX_ROBOT_JUMP = 50;
    private String name;

    @Override
    public void run() {
        System.out.println(getName() +
                " the robot ran " + MAX_ROBOT_RUNNING_DISTANCE + " cm");
    }

    @Override
    public void jump() {
        System.out.println(getName() +
                " the robot jump " + MAX_ROBOT_JUMP + " cm");
    }

    @Override
    public void overcome(Obstacle[] obstacles) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle instanceof Wall wall) {
                if (ifObstacleIsWall(wall)) return;
            } else if (obstacle instanceof Racetrack racetrack) {
                ifObstacleIsRacetrack(racetrack);
            }
        }
    }

    private void ifObstacleIsRacetrack(Racetrack racetrack) {
        if (MAX_ROBOT_RUNNING_DISTANCE > racetrack.getDistance()) {
            System.out.println(getName() + " пробіг всю дистанцію. " +
                    "Довжина -- [" + racetrack.getDistance() + "].\n" +
                    "Здобуває перемогу.\n");
        } else {
            System.out.println(getName() + " не пробіг потрібну кількість. " +
                    "-- [" + racetrack.getDistance() + "]\n");
        }
    }

    private boolean ifObstacleIsWall(Wall wall) {
        if (MAX_ROBOT_JUMP > wall.getDistance()) {
            System.out.println(getName() + " перепригнув перешкоду. " +
                    "-- [" + wall.getDistance() + "].");
        } else {
            System.out.println(getName() + " не впорався з перешкодою.\n" +
                    "wall -- [" + wall.getDistance() + "]\n");
            return true;
        }
        return false;
    }
}