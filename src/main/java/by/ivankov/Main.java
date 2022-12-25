package by.ivankov;

import by.ivankov.entity.Car;
import by.ivankov.entity.Detail;
import by.ivankov.entity.Equipment;
import by.ivankov.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Detail> details = new ArrayList<>();
        Car car = new Car("Extended Assembly", Equipment.EXPANDED, details);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
        Order order = new Order(888, car, 1);
        order.toStringCheque();

        List<Detail> details1 = new ArrayList<>();
        Car car1 = new Car("Standard Assembly ", Equipment.STANDARD, details1);
        car1.addDetail(Detail.MOTOR_V8);
        car1.addDetail(Detail.STANDARD_BRAKES);
        car1.addDetail(Detail.SUSPENSION);
        Order order1 = new Order(523, car1, 3);
        order1.toStringCheque();
    }
}