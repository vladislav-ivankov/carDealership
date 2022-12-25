package by.ivankov.entity;

import java.time.LocalTime;

public class Order {
    private LocalTime localTime = LocalTime.now();
    private int clientNumber;
    private int qualityOrder;
    static final int MIN_ORDER_EQUIPMENT = 1;
    static final int MAX_ORDER_EQUIPMENT = 5;
    private Car car;
    static final int MIN_RANGE = 10000;
    static final int MAX_RANGE = 99999;

    public Order(int clientNumber, Car car, int qualityOrder) {
        this.qualityOrder = qualityOrder;
        this.clientNumber = clientNumber;
        this.car = car;
    }

    public int getQualityOrder() {
        if (qualityOrder >= MIN_ORDER_EQUIPMENT && qualityOrder <= MAX_ORDER_EQUIPMENT) {
            this.qualityOrder = qualityOrder;
        } else if (qualityOrder < MIN_ORDER_EQUIPMENT) {
            qualityOrder = 1;
        } else if (qualityOrder > MAX_ORDER_EQUIPMENT) {
            qualityOrder = 5;
        }
        return qualityOrder;
    }

    public int orderNumber() {
        return (int) ((Math.random() * (MAX_RANGE - MIN_RANGE)) + MIN_RANGE);
    }

    public int orderTotalAmount(){
        return car.orderTotalPrice() * qualityOrder;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void toStringCheque() {
        System.out.println("\n" +"*".repeat(30));
        System.out.println("Order: " + orderNumber());
        System.out.println("Client: " + clientNumber);
        System.out.println("Title: " + car.getEquipmentName());
        System.out.println("-".repeat(30));
        System.out.printf("%-14s %14s %n", car.getTypeEquipment().getTitle(), car.getTypeEquipment().getPrice() +" $");
        for(Detail detail : car.getDetailsList()){
            System.out.printf("%-20s %8s %n", detail.getTitle(), detail.getPrice() +" $") ;
        }
        System.out.println("-".repeat(30));
        System.out.printf("%-14s %14s %n", "Total: " ,car.orderTotalPrice() +" $");
        System.out.printf("%-14s %14s %n", "Quantity: ", getQualityOrder());
        System.out.println("-".repeat(30));
        System.out.printf("%-14s %14s %n", "Total amount: ", orderTotalAmount() +" $");
        System.out.printf("%-14s %14s %n", "Order time: ", getLocalTime().getHour() +":" +getLocalTime().getMinute());
        System.out.println("*".repeat(30));
    }
}
