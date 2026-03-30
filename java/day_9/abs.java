package day_9;
abstract class device{
    abstract void turnon();
    abstract void turnoff();
    public void displayinfo(){
      System.out.println("this is a device");
    }
}
class fan extends device{
  public void fans(){
      System.out.println("fan is on");
  }
  @Override
  public void turnon(){
    System.out.println("fan is on");
  }
  @Override
  void turnoff() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'turnoff'");
  }
}
class Ac extends device{
    public void Acs(){
        System.out.println("Ac is on");
    }
    @Override
    public void turnon(){
        System.out.println("Ac is on");
    }
    @Override
    public void turnoff(){
        System.out.println("Ac is off");
    }
}
 
public class abs {
    public static void main(String[] args) {
        device d=new Ac();
        d.turnoff();
    }
}
