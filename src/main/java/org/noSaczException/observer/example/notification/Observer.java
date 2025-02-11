package org.noSaczException.observer.example.notification;

import org.noSaczException.observer.example.order.Order;

public interface Observer {
    void update(Order order);
}
