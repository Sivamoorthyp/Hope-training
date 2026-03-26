package java.day_3;
public class maximumoddbinary {
       public String maximumOddBinaryNumber(String s) {
        int one=0,zero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            else{
                zero++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<one;i++){
            sb.append("1");
        }
        for(int i=1;i<=zero;i++){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}

