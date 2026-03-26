class Solution {
    public int minBitFlips(int start, int goal) {
            int xor=start^goal;
            return Integer.bitCount(xor);


    }
}
        /*
        String bin1=Integer.toBinaryString(start);
         String bin2=Integer.toBinaryString(goal);
         StringBuilder sb=new StringBuilder();
         if(bin1.length()!=bin2.length()){
            if(bin1.length()>bin2.length()){
                int dif=bin1.length()-bin2.length();
                String ss="";
                for(int i=0;i<dif;i++){
                    ss+="0";
                }
                bin2=ss+bin2;
            }
            else{
                int dif=bin2.length()-bin1.length();
                String ss="";
                for(int i=0;i<dif;i++){
                    ss+="0";
                }
                bin1=ss+bin1;
            }
         }
         int count=0;
         for(int i=0;i<bin1.length();i++){
            if(bin1.charAt(i)==bin2.charAt(i)){
                continue;
            }
            else{
                count++;
            }
         }
         return count;
    }
}
*/