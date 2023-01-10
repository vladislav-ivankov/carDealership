package by.ivankov.task2.service.impl;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.СalculatorPriceService;

public class СalculatorPriceServiceImpl implements СalculatorPriceService {

    @Override
    public int orderTotalPrice(Order order) {
        int totalPrice = 0;
        for (Detail detail : order.getCar().getDetailsList()) {
            totalPrice += detail.getPrice();
        }
        return totalPrice + order.getCar().getTypeEquipment().getPrice();
    }

    @Override
    public int orderTotalAmount(Order order) {
        return orderTotalPrice(order) * order.getQualityOrder();
    }
}
