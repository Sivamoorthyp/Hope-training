
       /*  for(int n: map.keySet()){
            System.out.println(n+" "+map.get(n));
        }
*/
package day_15;
import java.util.*;
public class mapexample {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr={1,2,2,3,3,4,5,6};
        for(int i=1;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        for(int n: map.keySet()){
            System.out.println(n+" "+map.get(n));
        }


        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
  
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }    
    
    
    
    
    
    }

}