class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigitsum=0;
        int doubledigitsum=0;
        for(int n:nums){
            if(n>=0 && n<=9) singledigitsum+=n;
            else doubledigitsum+=n;
        }
        int alicechoose=Math.max(singledigitsum,doubledigitsum);
        int bobchoose=0;
        if(alicechoose==singledigitsum){
            bobchoose=doubledigitsum;
        }
        else{
            bobchoose=singledigitsum;
        }
        if(alicechoose>bobchoose){
            return true;
        }
        return false;
    }
}