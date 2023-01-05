package by.ivankov.task2.service.impl;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.СalculatorPriceService;

public class СalculatorPriceServiceImpl implements СalculatorPriceService {

    @Override
    public int orderTotalPrice(Order order, Car car) {
        int totalPrice = 0;
        for (Detail detail : car.getDetailsList()) {
            totalPrice += detail.getPrice();
        }
        return totalPrice + car.getTypeEquipment().getPrice();
    }

    @Override
    public int orderTotalAmount(Order order, Car car) {
        return orderTotalPrice(order, car) * order.getQualityOrder();
    }
}
