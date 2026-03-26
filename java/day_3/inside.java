package java.day_3;
class student{
    int marks;
}
public class inside {
    public static void change(student s){
        s.marks+=10;
       
    }
    public static void main(String[] args) {
        student s=new student();
        s.marks=90;
        change(s);
        System.out.println(s.marks);
    }
}
