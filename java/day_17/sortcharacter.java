//by using comparator
package day_17;
import java.util.*;
public class sortcharacter{
    public List<Character> sortchar(String s){
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            
            }
            List<Map.Entry<Character,Integer>> l=new ArrayList<>(m.entrySet());
        Collections.sort(l,(a,b)->{

            if(b.getValue()!=a.getValue())
                 return b.getValue()-a.getValue(); 
            else 
                return a.getKey()-b.getKey();}
            );
            
        ArrayList<Character> arr=new ArrayList<>();
        for(Map.Entry<Character,Integer> ms: l){
            arr.add(ms.getKey());
            
        }
        return arr;
            
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sortcharacter s=new sortcharacter();
        List<Character> res=s.sortchar(str);
        System.out.println(res);
    }
}


/* 
// by using  lambda we can sort  


    package day_17;
import java.util.*;
public class sortcharacter{
    public List<Character> sortchar(String s){
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            
            }
            List<Map.Entry<Character,Integer>> l=new ArrayList<>(m.entrySet());
        Collections.sort(l,(a,b)->b.getValue()-a.getValue());
        ArrayList<Character> arr=new ArrayList<>();
        for(Map.Entry<Character,Integer> ms: l){
            arr.add(ms.getKey());
            
        }
        return arr;
            
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sortcharacter s=new sortcharacter();
        List<Character> res=s.sortchar(str);
        System.out.println(res);
    }
}
    */