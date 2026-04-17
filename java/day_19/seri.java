package day_19;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class seri {
    public static void main(String[] args) throws IOException{
        student s=new student("xyz",44);
        FileOutputStream fo=new FileOutputStream("seri.txt");  // open into file 
        ObjectOutputStream oo=new ObjectOutputStream(fo);   // object convert into byte stream
        oo.writeObject(s);  // writing on files
        oo.close();
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(ObjectOutputStream oo) throws IOException{
        super(oo);
    }
    protected void writeStreamHeader() throws IOException{
        // do nothing
    }
}
class student implements Serializable{
   String name;
   int mark;
   student(String name,int mark){
       this.name=name;
       this.mark=mark;
   }
}

