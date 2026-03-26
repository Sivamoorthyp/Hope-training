package java.day_2;
public class stringtest {
    public static void main(String[] args) {
        String s1="java is a programming language";
      /*  for(char ch: s1.toCharArray()){
           System.out.print(ch);
       }
       s1=s1.replace("java","python");
       System.out.println("\n"+s1);
       StringBuilder sb=new StringBuilder(s1);
       System.out.println(sb.toString());
*/
      s1=s1.replace(" ","");
      System.out.println(s1.length());
    }
}
