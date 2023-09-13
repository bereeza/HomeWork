package org.example.lesson5.task2;

import org.example.lesson5.task2.obstacle.Obstacle;
import org.example.lesson5.task2.obstacle.Racetrack;
import org.example.lesson5.task2.obstacle.Wall;
import org.example.lesson5.task2.paticipant.Cat;
import org.example.lesson5.task2.paticipant.Human;
import org.example.lesson5.task2.paticipant.Participant;
import org.example.lesson5.task2.paticipant.Robot;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall();
        Racetrack racetrack = new Racetrack();
        Obstacle[] obstacleArray = {wall, racetrack};
        Cat cat = new Cat("Feliks");
        Human human = new Human("Bob");
        Robot robot = new Robot("FN-2187");
        Participant[] participantArray = {human, cat, robot};
        for (Participant participant : participantArray) {
            participant.overcome(obstacleArray);
        }
    }
}
