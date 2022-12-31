package by.ivankov.task2.service.impl;

import by.ivankov.task2.service.OrderChequeService;
import by.ivankov.task2.entity.Detail;
import by.ivankov.task2.entity.Order;

import java.time.LocalTime;

public class OrderChequeServiceImpl implements OrderChequeService {
    @Override
    public void Cheque(Order order) {
        StringBuilder sb = new StringBuilder();
        CarPriceServiceImpl service = new CarPriceServiceImpl();
        LocalTime localTime = LocalTime.now();

        String numberOfOrders = String.valueOf(order.getNumberOfOrders());
        String clientNumber = String.valueOf(order.getClientNumber());
        String orderNumber = String.valueOf(order.getOrderNumber());

        sb.append("\n" + "*".repeat(30) + "\n"
                + "Order: " + orderNumber + "\n"
                + "Client: " + clientNumber + "\n"
                + order.Title() + "\n"
                + "-".repeat(30) + "\n");
        sb.append(String.format("%-14s %14s %n", order.typeEquipment().getTitle(), order.typeEquipment().getPrice() +" $"));
        for (Detail detail : order.details()) {
            sb.append(String.format("%-20s %8s %n", detail.getTitle(), detail.getPrice() + " $"));
        }
        sb.append("-".repeat(30) + "\n");
        sb.append(String.format("%-14s %14s %n", "Total: ", service.orderTotalPrice(order) + " $"));
        sb.append(String.format("%-14s %14s %n", "Quantity: ", numberOfOrders));
        sb.append(String.format("-".repeat(30) + "\n"));
        sb.append(String.format("%-14s %14s %n", "Total amount: ", service.orderTotalAmount(order) + " $"));
        sb.append(String.format("%-14s %14s %n", "Order time: ", localTime.getHour() + ":" + localTime.getMinute()));
        sb.append("*".repeat(30));

        System.out.println(sb);
    }
}
