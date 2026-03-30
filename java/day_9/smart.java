package day_9;

abstract class smartdevice{
    abstract void turnon();
    abstract void turnoff();
    void displayinfo(){
      System.out.println("this is a smart device");
    }

}
class light extends smartdevice{
    @Override
  public void turnon(){
    System.out.println("light is on");
  }
  @Override
void turnoff(){
    System.out.println("light is off");

  }
}
public class smart{
    public static void main(String[] args) {
        smartdevice s=new light();
        s.turnoff();
        s.turnon();
        s.displayinfo();// method to acc
    }
}
