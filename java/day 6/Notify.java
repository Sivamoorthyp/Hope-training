class Notification{
    String name;
    String message;
    Notification(String name, String message) {
        this.name = name;
        this.message = message;
    }
            void send(){
                System.out.print("sending notification to the parent class ");
            }

}
class EmailNotification extends Notification{
    EmailNotification(String name, String message) {
        super(name, message);
    }
    void send(){
        System.out.print("sending email notification ");
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
    }

}
class SmsNotification extends Notification{
    SmsNotification(String name, String message) {
        super(name, message);}

     void send(){
        System.out.print("sending notification from sms ");
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
    }
}
public class Notify {
    public static void main(String[] args) {
        
    
    Notification n;
    n = new EmailNotification("Alice", "Hello from Email!");
    n.send();
   /* n.changeEmail();   in this we not able to access the function because in that case the reference type is Notification */

    }
}
/*
  Refernce to control acess
  Object to control behaviour
   Notification n;  // reference type to control acess
   new EmailNotification(); // object to control behaviour
*/