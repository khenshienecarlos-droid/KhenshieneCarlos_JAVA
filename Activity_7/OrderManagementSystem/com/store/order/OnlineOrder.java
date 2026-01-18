package com.store.order;

import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable {

    public OnlineOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("\nProcessing online order...");
    }

    @Override
    public void pay() {
        setStatus(OrderStatus.PAID);
        System.out.println("Payment for order " + getOrderId() + " successful.");
    }
    
    public void cancelOrder() {
        setStatus(OrderStatus.CANCELLED);
        System.out.println("Order " + getOrderId() + " has been cancelled.");
    }
}
