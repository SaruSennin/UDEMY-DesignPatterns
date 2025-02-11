package org.noSaczException.observer.example;

import org.noSaczException.observer.example.notification.Email;
import org.noSaczException.observer.example.notification.MobileApp;
import org.noSaczException.observer.example.notification.TextMessage;
import org.noSaczException.observer.example.order.Order;
import org.noSaczException.observer.example.order.OrderStatus;

/**
 * Obserwator to obiekt, który zapisuje się do innego obiektu (nazywanego obserwowanym) i otrzymuje powiadomienia,
 * gdy ten obiekt się zmienia. Dzięki temu może automatycznie reagować na te zmiany.
*/
public class Main {

    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        System.out.println();
        order.notifyObservers();
        System.out.println();
        order.changeOrderStatus(OrderStatus.WYSLANE);
        order.removeObserver(email);
        System.out.println();
        order.changeOrderStatus(OrderStatus.ZAREJESTROWANE);
    }
}
