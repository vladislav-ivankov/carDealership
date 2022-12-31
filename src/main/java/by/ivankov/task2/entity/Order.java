package by.ivankov.task2.entity;


import java.util.List;

public class Order {
    private static final int MIN_SIZE_NAME = 4;
    private static final int MAX_SIZE_NAME = 20;
    public static final int ORDER_LIMIT = 5;
    private static int orderNumber = 10000;
    private int clientNumber;
    private int numberOfOrders;
    private Car car;

    public Order(int clientNumber, int qualityOrder, Car car) {
        this.numberOfOrders = qualityOrder;
        this.clientNumber = clientNumber;
        this.car = car;
    }

    public List<Detail> details() {
        return car.getDetailsList();
    }

    public Equipment typeEquipment() {
        return car.getTypeEquipment();
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public int getNumberOfOrders() {
        if (numberOfOrders < 1) {
            return 1;
        } else if (numberOfOrders > ORDER_LIMIT) {
            return ORDER_LIMIT;
        }
        return numberOfOrders;
    }

    public int getOrderNumber() {
        orderNumber++;
        return (orderNumber < 99999 ? orderNumber : 10000);
    }

    public String Title() {
        if (MIN_SIZE_NAME <= car.getName().length() && car.getName().length() <= MAX_SIZE_NAME) {
            return ("Title: " + car.getName());
        } else
            return ("Title: Client[" + getOrderNumber() + "]");
    }
}
