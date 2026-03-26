package day_5;

class MainApp {
    public static void main(String[] args) {
        fooduser f1 = new fooduser("biriyani");
        traveler t1 = new traveler("goa");
        traveler t2 = new traveler("siva");
        System.out.println("food name is " + f1.foodname);
        System.out.println("traveler place is " + t1.place);
        System.out.println("traveler name is " + t2.name);
    }
}
