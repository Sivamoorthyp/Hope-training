package day_9;
class battery{
    public void powersuply(){
        System.out.println("still battery have power");
    }
}
class remote{
    battery miniBattery=new battery();// has a relationship
    public void change(){
        miniBattery.powersuply();
        System.out.println("channel changed");
    }
    public void changevolume(){
    
        System.out.println("volume changed");
    }
}
class tv{
    remote tvremote;
    public tv(remote r){
        this.tvremote=r;// has a relationship
    }
    public void increasevolume(){
        tvremote.changevolume();
        System.out.println("volume increased");
    }
}
public class relaton {
    public static void main(String[] args) {
        remote r=new remote();
        r.change();
        tv t=new tv(r);
        t.increasevolume();
    }
}
