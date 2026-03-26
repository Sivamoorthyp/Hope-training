package java.day_2;
public class signofproduct {
   
    public int arraySign(int[] nums) {
       int neg=0;
       int pos=0;
       for(int n: nums){
        if(n==0)return 0;
        if(n<0)neg++;
        else if(n>0)pos++;
       }
       if(neg%2==0)return 1;
       else return -1;

    }

}
