/*
 - Design locker system where user can store items securely 
 - Each locker protect its internal data and only controlled operation
  
1) REQUIRMENTS
   each locker has
     locker id
    islocked(boolean)
     pin
     stored them
2) OPERATION
    Store item(item,pin)
    retrive item(pin)
    lock()
    unlock(pin)
3) RULES
    Items cannot acess directly
    locker opens only with crt pin
    invalid acess should be blocked */
package day_10;
public class designlocker {
    private int lockerId;
    private boolean isLocked;
    private int pin;
    private String storedItem;
    public designlocker(int lockerId,int pin){
        this.lockerId=lockerId;
        this.pin=pin;
        this.isLocked=true;
        this.storedItem="";
    }

    public void pins(int pin){
        if(this.pin==pin){
            isLocked=false;
            System.out.println("Locker unlocked successfully.");
        }
        else{
            System.out.println("Invalid pin. Access denied.");
        }
        
    }
    public boolean lock(){
        if(isLocked){
            return true;
        }
        return false;
    }
    public void unlock(){
        if(123==pin){
            isLocked=false;
        }
        else{
            System.out.print("enter the correct pin");
        }
    }
    public void storeItem(String item,int pin){
        if(isLocked){
            System.out.println("Locker is locked. Please unlock it first.");
        }
        else if(this.pin!=pin){
            System.out.println("Invalid pin. Access denied.");
        }
        else if(storedItem!=null && !isLocked){
            this.storedItem=item;
            System.out.println("Item stored successfully "+storedItem);
        }
    }
    public void display(){
        System.out.print(lockerId);
    }
}
public class lockersystem {
    public static void main(String[] args){
        designlocker d=new desighlocker();
        d.designlocker(12345678,123);
        d.lock();
        d.unlock(123);
        d.storeitem("gold",123);

    }
}
