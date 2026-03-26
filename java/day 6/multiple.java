class multiples{
    String name;
    String phone;
    String address;
    multiples(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
class fooduser extends multiples{
    String foodname;
    fooduser(String name, String phone, String address, String foodname) {
        super(name, phone, address);
        this.foodname = foodname;
        System.out.println("Food User Details:");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Favorite Food: " + foodname);
    }
}
class traveler extends multiples{
    String vehiclename;
    String vehicletype;
    traveler(String name, String phone, String address, String vehiclename, String vehicletype) {
        super(name, phone, address);
        this.vehiclename = vehiclename;
        this.vehicletype = vehicletype;
        System.out.println("Traveler Details:");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Vehicle Name: " + vehiclename);
        System.out.println("Vehicle Type: " + vehicletype);
    }

}
class parceldelivery extends multiples{
    String parcelname;
    String parceltype;
    parceldelivery(String name, String phone, String address, String parcelname, String parceltype) {
        super(name, phone, address);
        this.parcelname = parcelname;
        this.parceltype = parceltype;
        System.out.println("Parcel Delivery Details:");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Parcel Name: " + parcelname);
        System.out.println("Parcel Type: " + parceltype);
    }
}
class multiple{
    public static void main(String[] args) {
        fooduser f=new fooduser("Alice", "1234567890", "123 Main St", "Pizza");
        System.out.println();
        traveler t=new traveler("Bob", "0987654321", "456 Oak Ave", "Honda Civic", "Sedan");
        System.out.println();
        parceldelivery p=new parceldelivery("Charlie", "5551234567", "789 Pine Rd", "Laptop", "Electronics");
    }

}