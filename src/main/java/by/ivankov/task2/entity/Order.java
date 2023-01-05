package by.ivankov.task2.entity;

public class Order {
    public static final int ORDER_LIMIT = 5;
    private int clientNumber;
    private int qualityOrder;

    public Order(int clientNumber, int qualityOrder) {
        setQualityOrder(qualityOrder);
        this.clientNumber = clientNumber;
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

    public int getQualityOrder() {
        return qualityOrder;
    }
}
