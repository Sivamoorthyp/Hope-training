package day_9;
interface remote {
    void change();
}
interface Innerinter {
void inter();
    
}
class tv implements remote,Innerinter{
    @Override
    public void change(){
        System.out.println("channel changed");
    }

    @Override
    public void inter() {
        System.out.println("inner interface method called");
    }
}
public class inter {
    public static void main(String[] args) {
        remote r=new tv();
        r.change();
        Innerinter i=new tv();
        i.inter();
    }
}
