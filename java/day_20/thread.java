public class thread{
    public static void task1(){
        for(int i=0; i<5; i++){
            System.out.println("Task 1: " + i);
        }
    }
    public static void task2(){
        for(int i=0; i<5; i++){
            System.out.println("Task 2: " + i);
        }
    }

    public static void main(String[] args) {
    task1();
    task2();
    }
}