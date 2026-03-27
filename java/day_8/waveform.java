import java.util.*;
public class waveform{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.length()==0){
            System.out.println("");
        }
        if(str.length()<2){
           System.out.println(str);
        }
        else{
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i+=2){
                          sb.append(str.charAt(i));
            }
            for(int i=1;i<str.length();i+=2){
                   sb.append(str.charAt(i));
            }
            System.out.println(sb.toString());
           

        }
    }
}