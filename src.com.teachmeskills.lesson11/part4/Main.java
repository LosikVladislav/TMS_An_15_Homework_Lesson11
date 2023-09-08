package part4;

import part4.model.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> order = new ArrayList<>();
        order.add(new Order(1, 120));
        order.add(new Order(2, 540));
        order.add(new Order(3, 691));
        order.add(new Order(4, 123));
        order.add(new Order(5, 85));

        System.out.println(order);

        Comparator<Order> comparator = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };

        Collections.sort(order, comparator);
        System.out.println(order);
    }
}
