package day_5;

public class main {
    String name="siva";
    String age;
    String mobile;
    String email;
    String address;
    main() {
        System.out.println("this is users class constructor");
    }
}
class Driver extends main{
    String drivername="siva";
    Driver(String drivername,String name) {
    
        System.out.println("driver name is " + drivername);  
        this.drivername = drivername;
    }
    void display() {
        System.out.println("driver name is " + drivername);
        System.out.println("user name is " + super.name);
    }
}
class fooduser extends main {
    String foodname;
    fooduser(String foodname) {
        this.foodname = foodname;
    }
}

class traveler extends main {
    String place;
    traveler( String name){
        super.name=name;
        System.out.println("traveler name is " + name);
    }
}

class MainApp {
    public static void main(String[] args) {
    Driver d1 = new Driver("siva","siva");
    d1.display();
    }
}
