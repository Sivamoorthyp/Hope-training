package day_12.com.EcommerceOrderSystem.service;

import day_12.com.EcommerceOrderSystem.model.Order;

public class orderservice {
    public void placeorder(Order o){
        System.out.println("order placed successfully for "+o.p.name+" with quantity "+o.quantity+" for user "+o.u.name);
        double totalprice=o.p.price*o.quantity;
        System.out.println("total price for the order is "+totalprice);
    }}
