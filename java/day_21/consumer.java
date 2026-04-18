package day_21;
import java.util.function.Consumer;
public class consumer {
    public static void main(String[] args) {
        Consumer<String> printString =(s)->System.out.println(s);
    printString.accept("from conseumr");    }
    List<String> names=List.of("abc","def","gh1");
    names.forEach(name->System.out.prrintln(name));
    // shortcurt for lambda function
    names.forEach(System.out::println);
}
}
