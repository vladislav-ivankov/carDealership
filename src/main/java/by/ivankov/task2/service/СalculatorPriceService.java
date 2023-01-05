package by.ivankov.task2.service;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Order;

public interface СalculatorPriceService {
    int orderTotalPrice(Order order, Car car);

    int orderTotalAmount(Order order, Car car);
}
