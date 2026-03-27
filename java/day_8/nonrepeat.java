import java.util.*;
public class nonrepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++){
            if(freq[i]==1){
                return (char)(i+'a');
            }
        }
        return '0';
    }
}
