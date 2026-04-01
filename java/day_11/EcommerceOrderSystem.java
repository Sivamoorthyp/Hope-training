/*
task- E-commerce order system
design system where user places an order , while ordering system must handle failures using exception handling 
1 product out of stack
2 payment failed 
3 order processsing failed 
  
clases 

product(name,stock,price)
user(name,address)
order(product,user,quantity)
orderservice(placeorder(oreder))
*/
class ProductOutOfStockException extends Exception{
    ProductOutOfStockException(String msg){
        super(msg);
    }
}
class PaymentFailedException extends Exception{
    PaymentFailedException(String msg){
        super(msg);
    }
}
class OrderProcessFailedException extends Exception{
    OrderProcessFailedException(String msg){
        super(msg);
    }
}
class product{
    static String name;
    static int stock;
    static double price;
    product(String name,int stock,double price){
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class user{
    String username;
    String address;
    user(String username,String address){
      this.username=username;
      this.address=address;

    }

}
class order{
    product product;
    int quantity;
    order(product p,int quantity){
        this.product=product;
        this.quantity=quantity;
    }
}

public class EcommerceOrderSystem{
       public static void productcheck(int stock,int product) throws ProductOutOfStockException,PaymentFailedException,OrderProcessFailedException{
        
        if(stock<product || product<=0){
            throw new ProductOutOfStockException("stock is low not able to be eligible");
        }
        else{
            System.out.println("stock object is eligible to buy");
        }
        if(stock<=0){
            throw new ProductOutOfStockException("low stock");
        }
        if(Math.random()<0.8){
            throw new PaymentFailedException("low amount");
        }

    }
    public static void main(String[] args) throws ProductOutOfStockException, PaymentFailedException, OrderProcessFailedException {
        product p=new product("bat", 100, 1000.0);
        user u=new user("siva", "hostel");
        try{productcheck(100,1000);
    }
    catch(ProductOutOfStockException e){
        System.out.println(e.getMessage());
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

    
}