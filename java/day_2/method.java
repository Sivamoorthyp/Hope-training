package java.day_2;
public class method {
    public static int mul(int n,int m){
        return n*m;
    }
    public static int  square(int n){
        return mul(n,n);
    }
    public static void print(int n){
        System.out.println(square(n));
    }
    public static void main(String[] args) {
        print(5);
    }
}

/*public class method {

    int mul(int n,int m){
        return n*m;
    }
  int  square(int n){
        return mul(n,n);
    }
 void print(int n){
        System.out.println(square(n));
    }
    public static void main(String[] args) {
       method m=new method();
       m. print(5);
    }
}
*/