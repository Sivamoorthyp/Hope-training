/*
    Employee(name,dep,salary,AGE){
        (dev,hr,support)
    } 
    1 -> filter by dept(dev)
    2 -> salary greater the 50K'
    3 -> total salry using sum() method
    4 -> average salary average() methoid
    5 -> total count of employee using count() method 
*/

package day_22;
import java.util.*;
class employee{
    String name;
    String dept;
    double salary;
    int age;
    employee(String name,String dept,double salary,int age){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

}
public class emp {
    public static void main(String[] args) {
        List<employee> employees=List.of(
            new employee("abc","dev",60000,30),
            new employee("def","hr",40000,25),
            new employee("ghi","support",50000,28),
            new employee("jkl","dev",70000,35),
            new employee("mno","hr",45000,32)
        );
        //filter
        List<employee> devemployee=employees.stream().filter(e-> e.getDept().equals("dev")).toList();
        System.out.println(devemployee);
        // salary
        List<employee> saary=employees.stream().filter(e->e.salary>50000).toList();
        System.out.println(saary);
        // total salary
        double total=employees.stream().mapToDouble(e->e.salary).sum();
        System.out.println(total);
        // average salary
        double average=employees.stream().mapToDouble(e->e.salary).average().orElse(0);
        System.out.println(average);
        // count
        long count=employees.stream().count();
        System.out.println(count);
    }
}
