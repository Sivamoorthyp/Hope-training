package day_16;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark - s.mark; // Ascending order
        // return s.mark - this.mark; // Descending order
    }
    public String toString(){
        return this.name + " " + this.mark;
}
public class ComparableInterface{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 80));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s.name + " " + s.mark);
        }
    }
}
    

