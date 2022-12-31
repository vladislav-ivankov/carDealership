package by.ivankov.task1.entity;

public enum Ball {
    BALL("blue", 2.4),
    BALL1("green", 5.6),
    BALL2("blue", 3.3),
    BALL3("blue", 6.4),
    BALL4("red", 7.2),
    BALL5("green", 2.8);

    private String colour;
    private double weight;

    Ball(String color, double weight) {
        this.colour = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return colour;
    }
}
