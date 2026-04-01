class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     int totalgas=0;
     int totalcost=0;
     int total=0;
     int st=0;
     for(int i=0;i<gas.length;i++){
        totalgas+=gas[i];
        totalcost+=cost[i];
        total+=gas[i]-cost[i];
        if(total<0){
            total=0;
            st=i+1;
        }

     }  
     if(totalcost<=totalgas){
        return st;
     } 
     return -1;
    }
}