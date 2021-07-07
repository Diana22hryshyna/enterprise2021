package pl.hryshyna.shop.service;

import pl.hryshyna.shop.model.Order;

public interface OrderService {
    public Iterable<Order> getAllOrders();
    public Order create(Order order);
    public void update(Order order);
}
