package org.noSaczException.observer.example.notification;

import org.noSaczException.observer.example.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("App - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
