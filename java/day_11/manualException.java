class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class manualException{
   public static void checkage(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be greater than 18");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
    public static void main(String[] args) {
       try{
        checkage(16);
       }
       catch(Exception e)
       {
        System.out.println(e.getMessage());

       } 
    }
}