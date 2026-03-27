import java.util.*;
public class evenlength {
    public static boolean isEven(String s){
        if(s.length()%2==0){
            return true;
        }
            return false;
        
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && s.length()>0){
                if(isEven(s)){
                    sb.append(s).append(" ");
                 
                }
                s="";
            }
            else{
                s+=str.charAt(i);
            }
        }
        if(isEven(s)){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
