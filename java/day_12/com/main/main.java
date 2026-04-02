package day_12.com.main;

import day_12.com.EcommerceOrderSystem.*;
import day_12.com.EcommerceOrderSystem.service.orderservice;


public class main {
    public static void main(String[] args) {
        user u1=new user("siva","hyd");
        product p1=new product("laptop",50000);
        order o1=new order(u1,(day_12.com.EcommerceOrderSystem.product) p1,2);
        orderservice os=new orderservice();
        os.placeorder(o1);
    }
}
