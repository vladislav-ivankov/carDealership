package by.ivankov.task2.entity;

public enum Detail {
    MOTOR_V8("Motor V8", 5000),
    MOTOR_V12("Motor V12", 9000),
    CRUISE_CONTROL("Cruise control", 1000),
    SPORT_BRAKES("Sport brakes", 500),
    RACING_SUSPENSION("Racing suspension", 600),
    LEATHER_INTERIOR("Leather interior", 2500),
    STANDARD_BRAKES("Standard brakes", 300),
    SUSPENSION("Suspension", 300);
    private String title;
    private int price;

    Detail(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
