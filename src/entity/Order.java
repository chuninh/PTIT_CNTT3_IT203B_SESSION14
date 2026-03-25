package entity;

import java.sql.Timestamp;

public class Order {
    private int id;
    private int userId;
    private Timestamp orderDate;

    public Order(int id, int userId, Timestamp orderDate) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
    }
}