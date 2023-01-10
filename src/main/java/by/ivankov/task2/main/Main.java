package by.ivankov.task2.main;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Equipment;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.impl.ChequeGeneratorServiceImpl;


public class Main {
    public static void main(String[] args) {
        ChequeGeneratorServiceImpl service = new ChequeGeneratorServiceImpl();

        Car car = new Car("Extended Assemblyyyyyy", Equipment.EXTENDED);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
//        car.addDetail(Detail.MOTOR_V12);
//        car.addDetail(Detail.MOTOR_V8);
//        car.addDetail(Detail.SUSPENSION);
//        car.addDetail(Detail.STANDARD_BRAKES);
//        car.addDetail(Detail.CRUISE_CONTROL);
//        car.addDetail(Detail.LEATHER_INTERIOR);
        Order order = new Order(888, 1, car);
        service.cheque(order);


        Car car1 = new Car("Standard Assembly", Equipment.STANDARD);
        car1.addDetail(Detail.MOTOR_V8);
        car1.addDetail(Detail.STANDARD_BRAKES);
        car1.addDetail(Detail.SUSPENSION);
        Order order1 = new Order(523, 3, car1);
        service.cheque(order1);
    }
}