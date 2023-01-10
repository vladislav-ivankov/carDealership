package by.ivankov.task2.entity;

public class Order {
    public static final int ORDER_LIMIT = 5;
    private int clientNumber;
    private int qualityOrder;
    private Car car;

    public Order(int clientNumber, int qualityOrder, Car car) {
        setQualityOrder(qualityOrder);
        this.clientNumber = clientNumber;
        this.car = car;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setQualityOrder(int qualityOrder) {
        if (qualityOrder < 1) {
            qualityOrder = 1;
        } else if (qualityOrder > ORDER_LIMIT) {
            qualityOrder = ORDER_LIMIT;
        }
        this.qualityOrder = qualityOrder;
    }
    public Car getCar(){
        return car;
    }

    public int getQualityOrder() {
        return qualityOrder;
    }
}
