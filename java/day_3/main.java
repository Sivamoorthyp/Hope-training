package java.day_3;
import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
           int limit=sc.nextInt();
           int[]arr=new int [limit] ;
           for(int j=0;j<limit;j++){
               arr[j]=sc.nextInt();
           }
           boolean found=false;
           for(int k=0;k<limit-1;k++){
            for(int j=k+1;j<limit;j++){
                if(arr[k]*arr[j]==67){
                   found=true;
                   break;
                    
                }
            }
            if(found)break;
           }
           if(found)System.out.println("YES");
           else{
            System.out.println("NO");
           }

        }
    }
}