/* default constructor 
class Student { 
    String name;
    int rollno;
    Student(){
        System.out.println(name);
    }
}

public class constr {
    public static void main(String[] args){
       Student s1=new Student();
   


    }
}
    */

/*  parametrerized constructor*/

   class Student {
    String name;
    int rollno;
    Student(String names,int roll){
        System.out.println(names);
           System.out.println(roll);
        /*
        we want to assign the values in constructor means
          rollno=roll
          name
                */
               this. rollno=roll;
               this.name=names;


    }
}

public class constructor {
    public static void main(String[] args){
       Student s1=new Student("siva",374);
       System.out.println(s1.name);


    }
}
