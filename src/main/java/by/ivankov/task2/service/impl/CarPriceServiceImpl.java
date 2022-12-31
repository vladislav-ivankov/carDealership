package by.ivankov.task2.service.impl;

import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.CarPriceServices;

public class CarPriceServiceImpl implements CarPriceServices {

    @Override
    public int orderTotalPrice(Order order) {
        int totalPrice = 0;
        for (Detail detail : order.details()) {
            totalPrice += detail.getPrice();
        }
        return totalPrice + order.typeEquipment().getPrice();
    }

    @Override
    public int orderTotalAmount(Order order) {
        return orderTotalPrice(order) * order.getNumberOfOrders();
    }
}
