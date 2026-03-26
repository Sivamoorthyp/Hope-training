import java.util.*;
class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int id,String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double getTotalPrice(){
        return price*quantity;
    }
    void display(){
        System.out.println("id: "+id+"\n name: "+name+" \n price: "+price+" \n quantity: "+quantity+"\n total price: "+getTotalPrice());
    }

}
public class designcart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       Product[] p=new Product[n];
        for(int i=0;i<n;i++){
           int id=sc.nextInt();
           String name=sc.next();
           double price=sc.nextDouble();
           int quantity=sc.nextInt();
           p[i]=new Product(id,name,price,quantity);
           
        }
        double total=0;
        for(int i=0;i<n;i++){
            total+=p[i].getTotalPrice();
            p[i].display();
        }
        System.out.println(total);
    }
}
