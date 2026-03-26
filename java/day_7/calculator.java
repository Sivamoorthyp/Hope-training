
public class calculator {
   public static void main(String[] args) {
    ploy calc = new ploy(10, 5);
    calc.add();
   } 
}
public class ploy{
    int a;
    int b;
    ploy(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void add() {
        System.out.println("Addition: " + (a + b));
    }
    void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }
    void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }
    void divide() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

}
