package by.ivankov.task2.main;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Equipment;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.impl.ChequeGeneratorServiceImpl;


public class Main {
    public static void main(String[] args) {
        ChequeGeneratorServiceImpl service = new ChequeGeneratorServiceImpl();

        Car car = new Car("Extended Assemblyyyyyy", Equipment.EXPANDED);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
        Order order = new Order(888, 1);
        service.cheque(order, car);


        Car car1 = new Car("Standard Assembly", Equipment.STANDARD);
        car1.addDetail(Detail.MOTOR_V8);
        car1.addDetail(Detail.STANDARD_BRAKES);
        car1.addDetail(Detail.SUSPENSION);
        Order order1 = new Order(523, 3);
        service.cheque(order1, car1);
    }
}