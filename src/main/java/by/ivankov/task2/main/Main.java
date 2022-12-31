package by.ivankov.task2.main;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Equipment;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.impl.OrderChequeServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderChequeServiceImpl service = new OrderChequeServiceImpl();

        List<Detail> details = new ArrayList<>();
        Car car = new Car("Extended Assembly", Equipment.EXPANDED, details);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
        Order order = new Order(888, 1, car);
        service.Cheque(order);


        List<Detail> details1 = new ArrayList<>();
        Car car1 = new Car("Standard Assembly", Equipment.STANDARD, details1);
        car1.addDetail(Detail.MOTOR_V8);
        car1.addDetail(Detail.STANDARD_BRAKES);
        car1.addDetail(Detail.SUSPENSION);
        Order order1 = new Order(523, 3, car1);
        service.Cheque(order1);
    }
}