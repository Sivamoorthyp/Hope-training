package java.day_1;
import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        String str="12345";     
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(str.substring(0,i));
        }
    }
}
