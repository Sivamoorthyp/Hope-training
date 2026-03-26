package java.day_2;

import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int m= sc.nextInt();
        int l= sc.nextInt();
        if(n>m && n>l){
            System.out.println(n);
        }
        else if(m>l){
            System.out.println(m);
        }
        else{
            System.out.println(l);
        }
    }
}