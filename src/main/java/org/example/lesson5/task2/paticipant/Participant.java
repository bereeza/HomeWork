package org.example.lesson5.task2.paticipant;

import org.example.lesson5.task2.obstacle.Obstacle;

public abstract class Participant {
    public abstract void run();

    public abstract void jump();

    public abstract void overcome(Obstacle[] obstacle);
}