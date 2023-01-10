package by.ivankov.task2;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Equipment;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.service.СalculatorPriceService;
import by.ivankov.task2.service.impl.СalculatorPriceServiceImpl;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CarPriceServiceImplTest {

    @Test
    public void testOrderTotalPrice() {
        List<Detail> details = new ArrayList<>();
        Car car = new Car("Extended Assembly", Equipment.EXTENDED);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
        Order order = new Order(888, 1, car);
        СalculatorPriceService services = new СalculatorPriceServiceImpl();
        int actual = services.orderTotalPrice(order);
        int expected = 35100;
        assertEquals(actual, expected);
    }

    @Test
    public void testOrderTotalAmount() {
        List<Detail> details1 = new ArrayList<>();
        Car car = new Car("Standard Assembly ", Equipment.STANDARD);
        car.addDetail(Detail.MOTOR_V8);
        car.addDetail(Detail.STANDARD_BRAKES);
        car.addDetail(Detail.SUSPENSION);
        Order order = new Order(523, 3, car);
        СalculatorPriceService services = new СalculatorPriceServiceImpl();
        int actual = services.orderTotalAmount(order);
        int expected = 76800;
        assertEquals(actual, expected);
    }
}