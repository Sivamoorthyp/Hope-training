class Solution {
    public int lastRemaining(int n) {
      int step=1;
      int remain=n;
      int top=1;
      boolean left=true;
      while(remain>1){
        if(left || remain%2==1){
            top+=step;
        }
        step*=2;
        remain/=2;
        left=!left;
      }
      return top;
    }
}