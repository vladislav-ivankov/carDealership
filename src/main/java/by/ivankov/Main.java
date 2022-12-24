package by.ivankov;

import by.ivankov.base.Car;
import by.ivankov.base.Detail;
import by.ivankov.base.Equipment;
import by.ivankov.base.Order;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Detail> details = new ArrayList<>();
        Car car = new Car("Extended Assembly", Equipment.EXPANDED, details);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
        Order order = new Order(888, car,1);
        order.toString();
    }
}