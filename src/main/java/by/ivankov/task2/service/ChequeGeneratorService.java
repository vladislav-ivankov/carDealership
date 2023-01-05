package by.ivankov.task2.service;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.entity.Order;

import java.util.Calendar;

public interface ChequeGeneratorService {
    String cheque(Order order, Car car);
}
