class BankAccount{
  private double balance;
  public void setBalance(double balance){ // setters
    if(balance>0){
    this.balance=balance;
  }
  else{
    System.out.println("input is not Valid");
  }
}
  public double getBalance(){  // getters
    return balance;
  }
  public void withdraw(double amount){
    if(amount>0 && amount<=balance){
        balance-=amount;
    }
    else{
        System.out.println("Insufficient balance");
    }
  }
  public void deposit(double amount){
    if(balance>0){
        balance+=amount;

    }
    else{
        System.out.println("Entered invalid amount");
    }
  }
}
public class encapsule {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setBalance(1000.0);
        System.out.println(b.getBalance());
        b.withdraw(1000.0);
        System.out.println(b.getBalance());
        b.deposit(10000.0);
        System.out.println(b.getBalance());

        }
}
