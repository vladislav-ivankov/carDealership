package by.ivankov.task2.entity;

public enum Equipment {
    EXPANDED("Car Extended", 25000),
    STANDARD("Car Standard", 20000);
    private String title;
    private int price;

    Equipment(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public int getPrice() {
        return price;
    }
}
