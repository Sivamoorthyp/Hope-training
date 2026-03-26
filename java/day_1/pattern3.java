package java.day_1;
import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(String.valueOf("*").repeat(i));
        }
    }
}
