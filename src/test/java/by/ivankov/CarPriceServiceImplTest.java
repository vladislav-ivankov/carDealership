package by.ivankov;

import by.ivankov.entity.Car;
import by.ivankov.entity.Detail;
import by.ivankov.entity.Equipment;
import by.ivankov.entity.Order;
import by.ivankov.service.CarPriceServices;
import by.ivankov.service.Impl.CarPriceServiceImpl;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CarPriceServiceImplTest {

    @Test
    public void testOrderTotalPrice() {
        List<Detail> details = new ArrayList<>();
        Car car = new Car("Extended Assembly", Equipment.EXPANDED,details);
        car.addDetail(Detail.SPORT_BRAKES);
        car.addDetail(Detail.RACING_SUSPENSION);
        car.addDetail(Detail.MOTOR_V12);
        Order order = new Order(888, car, 1);
        CarPriceServices services = new CarPriceServiceImpl();
        int actual = services.orderTotalPrice(car, car.getTypeEquipment());
        int expected = 35100;
        assertEquals(actual, expected);
    }

    @Test
    public void testOrderTotalAmount() {
        List<Detail> details1 = new ArrayList<>();
        Car car = new Car("Standard Assembly ", Equipment.STANDARD, details1);
        car.addDetail(Detail.MOTOR_V8);
        car.addDetail(Detail.STANDARD_BRAKES);
        car.addDetail(Detail.SUSPENSION);
        Order order = new Order(523, car, 3);
        CarPriceServices services = new CarPriceServiceImpl();
        int actual = services.orderTotalAmount(car, order);
        int expected = 76800;
        assertEquals(actual, expected);
    }
}