package by.ivankov.service.Impl;

import by.ivankov.entity.Car;
import by.ivankov.entity.Detail;
import by.ivankov.entity.Equipment;
import by.ivankov.entity.Order;
import by.ivankov.service.CarPriceServices;

public class CarPriceServiceImpl implements CarPriceServices {

    @Override
    public int orderTotalPrice(Car car, Equipment typeEquipment) {
        int totalPrice = 0;
        for(Detail detail : car.getDetailsList()){
            totalPrice += detail.getPrice();
        }
        return totalPrice += typeEquipment.getPrice();
    }

    @Override
    public int orderTotalAmount(Car car, Order order) {
        return car.orderTotalPrice() * order.getQualityOrder();
    }
}
