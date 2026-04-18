package day_21;
import java.util.function.Predicate;
class student{
    int marks;
}
public class predicateex {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<student> isPassed = s -> s.marks >= 40;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
        student s1 = new student();
        s1.marks = 50;
        System.out.println("Is student passed? " + isPassed.test(s1));
    }
}
