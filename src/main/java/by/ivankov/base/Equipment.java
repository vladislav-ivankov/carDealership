package by.ivankov.base;

import java.util.SplittableRandom;

public enum Equipment {
    EXPANDED("Extended equipment", 25000),
    STANDARD("Standard equipment", 20000);
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
