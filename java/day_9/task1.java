/*
 smart home automation system
   if motion detected -> light on
   if temperature > 30 -> ac on
   At 7pm -> light on

   it should support
     multiple devices
     easy to add new devices
     easy to add new rules
*/

package day_9;

abstract class motionSensor{
    public abstract boolean detectmotion();
}
class temperatureSensor{
    public int getTemperature(){
        // logic to get temperature
       if(temperatureSensor.this.getTemperature()>30){
        return 1;
       }
       else{
        return 0;
       }
    }
}
class timeSensor{
    public String getTime(int time){
        // logic to get time
       if(time==7){
        return "1";

       }
       return "0";
        
    }
}
class light{
    public void turnon(){
        System.out.println("light is on");
    }
    public void turnoff(){
        System.out.println("light is off");
    }
}
class ac extends temperatureSensor{
    public void turnon(){
        if(getTemperature()==1){
            System.out.println("ac is on");
        }
    }
    public void turnoff(){
        System.out.println("ac is off");
    }
}

class lights extends timeSensor{
    int time;
    public void turnon(){
        if(getTime(time).equals("1")){
            System.out.println("light is on");
        }
    }
    public void turnoff(){
        System.out.println("light is off");
    }
}
public class task1 {
    public static void main(String[] args) {
        ac a=new ac();
        a.turnon();
        lights l=new lights();
        l.time=7;
        l.turnon();
    }
}
