/*
package day_22;

public class fairpair {
    public static int fairpair(int[] nums,int lower,int upper){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum>=lower && sum<=upper){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
int[] nums={0,1,7,4,4,5};
int lower=3;
int upper=6;
int result=fairpair(nums,lower,upper);
System.out.println(result);


    }
}
*/

/* fair pair efficient solution  */
package day_22;
import java.util.Arrays;
public class fairpair {
    public static int fairpair(int[] nums,int lower,int upper){
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum>=lower && sum<=upper){
                count+=right-left;
                left++;
            }
            else if(sum<lower){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={0,1,7,4,4,5};
        int lower=3;
        int upper=6;
        int result=fairpair(nums,lower,upper);
        System.out.println(result);
    }