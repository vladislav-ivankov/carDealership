package by.ivankov.task2.util;

public class IdGenerator {
    private static final int MAX_ORDER_VALUE = 99999;
    private static final int MIN_ORDER_VALUE = 10000;
    private static int orderId = MIN_ORDER_VALUE;

    private IdGenerator(){
    }
    public static int orderIdGenerator() {
        if (orderId > MAX_ORDER_VALUE) {
            orderId = MIN_ORDER_VALUE;
        }
        return orderId++;
    }
}
