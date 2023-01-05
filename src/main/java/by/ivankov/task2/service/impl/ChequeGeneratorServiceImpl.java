package by.ivankov.task2.service.impl;

import by.ivankov.task2.entity.Car;
import by.ivankov.task2.service.ChequeGeneratorService;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Order;
import by.ivankov.task2.util.IdGenerator;

import java.time.LocalTime;

public class ChequeGeneratorServiceImpl implements ChequeGeneratorService {
    @Override
    public String cheque(Order order, Car car) {
        StringBuilder sb = new StringBuilder();
        СalculatorPriceServiceImpl service = new СalculatorPriceServiceImpl();
        IdGenerator id = new IdGenerator();
        LocalTime localTime = LocalTime.now();

        String numberOfOrders = String.valueOf(order.getQualityOrder());
        String clientNumber = String.valueOf(order.getClientNumber());
        String orderId = String.valueOf(id.orderIdGenerator());
        String name = String.valueOf(car.getName());


        sb.append("\n" + "*".repeat(30) + "\n"
                + "Order: " + orderId + "\n"
                + "Client: " + clientNumber + "\n"
                + "Title: " + name + "\n"
                + "-".repeat(30) + "\n");
        sb.append(String.format("%-14s %14s %n", car.getTypeEquipment().getTitle(), car.getTypeEquipment().getPrice() + " $"));
        for (Detail detail : car.getDetailsList()) {
            sb.append(String.format("%-20s %8s %n", detail.getTitle(), detail.getPrice() + " $"));
        }
        sb.append("-".repeat(30) + "\n");
        sb.append(String.format("%-14s %14s %n", "Total: ", service.orderTotalPrice(order, car) + " $"));
        sb.append(String.format("%-14s %14s %n", "Quantity: ", numberOfOrders));
        sb.append(String.format("-".repeat(30) + "\n"));
        sb.append(String.format("%-14s %14s %n", "Total amount: ", service.orderTotalAmount(order, car) + " $"));
        sb.append(String.format("%-14s %14s %n", "Order time: ", localTime.getHour() + ":" + localTime.getMinute()));
        sb.append("*".repeat(30));

        System.out.println(sb);
        return sb.toString();
    }
}
