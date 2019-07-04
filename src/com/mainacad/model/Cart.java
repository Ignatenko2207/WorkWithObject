package com.mainacad.model;

import java.util.Date;

public class Cart {

    private User user;
    private Order order;
    private Long time;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Cart(User user, Order order, Long time) {
        this.user = user;
        this.order = order;
        this.time = time;
    }

    public Cart() {
    }
}
