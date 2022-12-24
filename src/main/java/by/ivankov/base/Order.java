package by.ivankov.base;

import java.util.StringJoiner;

public class Order {
    private int orderNumber;
    private int clientNumber;
    private int numberOrders;
    static final int MIN_ORDER_EQUIPMENT = 1;
    static final int MAX_ORDER_EQUIPMENT = 5;
    private Car car;
    static final int MIN_RANGE = 10000;
    static final int MAX_RANGE = 99999;

    static final String DOLLAR = "$";

    public Order(int clientNumber, Car car, int numberOrders) {
        this.numberOrders = numberOrders;
        this.clientNumber = clientNumber;
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setNumberOrders(int numberOrders) {
        this.numberOrders = numberOrders;
    }

    public int getNumberOrders(){
        if (numberOrders >= MIN_ORDER_EQUIPMENT && numberOrders <= MAX_ORDER_EQUIPMENT) {
            this.orderNumber = orderNumber;
        }else if (numberOrders < MIN_ORDER_EQUIPMENT){
            numberOrders = 1;
        }else if (numberOrders > MAX_ORDER_EQUIPMENT){
            numberOrders = 5;
        }
        return 0;
    }
    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientNumber(String clientNumber) {
        return clientNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return (int) ((Math.random() * (MAX_RANGE - MIN_RANGE)) + MIN_RANGE);
    }

    @Override
    public String toString() {
        return String.valueOf(new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("****************************")
                .add("Order: " +getOrderNumber())
                .add("Client: " +clientNumber)
                .add("Title: " +car.getEquipmentName())
                .toString());
    }
}
