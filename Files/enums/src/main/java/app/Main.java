package app;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVEREDq");

        System.out.println(os1);
        System.out.println(os2);
    }
}