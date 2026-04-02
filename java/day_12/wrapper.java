package day_12;
import java.util.*;
public class wrapper {
    public static Integer/*int also come */ test(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        
    
    Integer b=Integer.valueOf("10");// return type -> object(Integer)
    System.out.println(b); 
    Integer c=Integer.parseInt("12234");// return type -> int
    System.out.println(c);

    int a=b;// unboxing -> Integer - Int
    Integer d=a;// autoboxing -> int - Integer


    System.out.println(test("100"));

    ArrayList<Integer> list=new ArrayList<>();
    list.add(10); // autoboxing -> int - Integer
    int num=list.get(0); // unboxing -> Integer - int
}
}
