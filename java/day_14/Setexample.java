package day_14;
import java.util.*;


public class Setexample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> linkedSet=new LinkedHashSet<>();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i:arr){
            set.add(i);
            linkedSet.add(i);
        }
        System.out.println(set);
        System.out.println(linkedSet);
    }
}
