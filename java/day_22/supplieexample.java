import java.util.function.Supplier;
import java.lang.Math;
class person{
    String name="supplier";
}
public class supplieexample{
    public static void main(String[] args) {
        Supplier<Integer> s=()->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<person> s1=()->new person();
        System.err.println(s1.get().name);
    }
}