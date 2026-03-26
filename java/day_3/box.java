package java.day_3;
public class box {
   
    public String categorizeBox(int length, int width, int height, int mass) {
        long  volume=(long)length*(long)width*(long)height;
        boolean bulky=false;
        boolean heavy=false;
        if(length>=10000 || width>=10000|| height>=10000 || mass>=10000 || volume>=1000000000){
            bulky=true;
        }
        if(mass>=100)heavy=true;
        if(bulky && heavy)return "Both";
        else if(bulky && !heavy)return "Bulky";
        else if(heavy && !bulky )return "Heavy";
        return "Neither";
    }
}

