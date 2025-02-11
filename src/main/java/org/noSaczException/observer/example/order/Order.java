package org.noSaczException.observer.example.order;

import org.noSaczException.observer.example.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObserver = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        registeredObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : registeredObserver) {
            observer.update(this);
        }
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void changeOrderStatus(OrderStatus newOrderStatus) {
        setOrderStatus(newOrderStatus);
        notifyObservers();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
