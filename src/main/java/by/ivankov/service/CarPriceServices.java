package by.ivankov.service;

import by.ivankov.entity.Car;
import by.ivankov.entity.Equipment;
import by.ivankov.entity.Order;

public interface CarPriceServices{
    int orderTotalPrice(Car car, Equipment typeEquipment);
    int orderTotalAmount(Car car, Order order);
    }
