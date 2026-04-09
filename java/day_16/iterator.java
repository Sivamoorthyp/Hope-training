package day_16;
import java.util.*;
public class iterator{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
       /*  for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
            */
         ListIterator<Integer> it = list.listIterator();
         while(it.hasNext()){
            System.out.println(it.next());
         }  
         while ((it.hasPrevious())) {
            System.out.println(it.previous());
         }
    }
}