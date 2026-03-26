class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int total=0;
        for(int n:nums){
            total+=n;
        }
        for(int i=0;i<nums.length;i++){
            total-=nums[i];
            if(left==total)return i;
            else{
                left+=nums[i];
            } 
        }
        return -1;
    }
}