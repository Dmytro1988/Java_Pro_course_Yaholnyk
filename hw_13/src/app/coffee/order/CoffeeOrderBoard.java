package app.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;
    private int nextOrderNum;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.nextOrderNum = 1;
    }
    public void add(String name) {
        Order order = new Order(nextOrderNum++, name);
        orders.add(order);
    }


    public Order delivery() {
        if (orders.isEmpty()) {
            return null;
        } else {
            return orders.remove(0);
        }

    }

    public Order delivery(int orderNum) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).orderNum() == orderNum) {
                return orders.remove(i);
            }
        }
            return null;

    }
    public void draw() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }



}
