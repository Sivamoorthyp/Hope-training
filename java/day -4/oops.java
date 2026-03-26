
class Student { //always start pascal case means captial always
    String name;
    int rollno;
    int marks=44;
    char c;
}

public class oops {
    public static void main(String[] args){
       Student s1=new Student();
       // s1- reference variable 
       // its all store stack memoery to access
       // new Student() is to create object in heap memory , by dynamic allocation during run time 
       System.out.println(s1.name);// null to print because initial there is no value in string
       System.out.println(s1.rollno);// print 0 beacuse 0 is the default value
       System.out.println(s1.c);// it default is null
       System.out.println(s1.marks);




       /*{
       - Student s1;
       - sout(s1.rollno) will come eror 
       - because the class student is only declared but not inialized so the we not abe to access the student calss
       }
       */
      //object - instance of class / real wolrd object created by using class, physical entity.
       // object -> combining data + behavour(methods)
       // we create multiple class it occupies memory 

    }
}