package day_22;
import java.util.*;
class employee{
    String name;
    int salary;
    employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
public class stream {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> multiplyby2=list.stream().map(n->n*2).toList();
        System.out.println(multiplyby2);
        List<employee> employees=List.of(new employee("abc",1000),new employee("def",2000),new employee("ghi",3000));
        List<String> names=employees.stream().map(e->e.name).toList();
        System.out.println(names);
        List<Integer> salaries=employees.stream().map(e->e.salary).toList();
        System.out.println(salaries);
        List<Integer> salaryincreased=employees.stream().filter(e->e.salary>3000).map(e->e.salary).toList();
        System.out.println(salaryincreased);
    }
}
