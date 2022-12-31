package by.ivankov.task2.service;

import by.ivankov.task2.entity.Order;

public interface CarPriceServices{
    int orderTotalPrice(Order order);
    int orderTotalAmount(Order order);
    }
