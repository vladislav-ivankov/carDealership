package by.ivankov.task1.entity;

import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
