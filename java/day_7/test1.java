package java.day_7;
import java.util.*;
public class test1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int count=0;
       for(int i=0;i<str.length()-1;i++){
        if((str.charAt(i+1)==' ') && ((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z'))){
            count++;
        }
       }
       if((str.charAt(str.length()-1)>='A' && str.charAt(str.length()-1)<='Z')||(str.charAt(str.length()-1)>='a' && str.charAt(str.length()-1)<='z')){
        count++;
       }
   System.out.println(count);
    }
}
