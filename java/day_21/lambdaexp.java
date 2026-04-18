package day_21;

@FunctionalInterface
interface math {
    int apply(int a,int b);
    
}
    
interface Excersise {
   
    void sayhello();
   }
public class lambdaexp {
    public static void main(String[] args){
        Excersise ex = () -> System.out.println("Hello, World!");
        ex.sayhello();
         math obj=(a,b) -> a+b;
        /* 
        math obj=(a,b) -> a+b;
        math obj2=(a,b) -> a-b;
        */
       /*  math obj=new math() {
            public int apply(int a,int b){
                return a+b;
            }
        };
        */
        System.out.println("Sum: " + obj.apply(5, 10));
       
    }
}
