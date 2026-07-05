package week_3_project;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }

    public void depositeBalance(double balance){
    if(balance>0){
        this.balance+=balance;
        System.out.println("Balance of: "+balance+"successfully deposite");
    }
    else
    System.out.println("plese enter valid balance");
    }

    public void withdrawlBalance(double amount){
        if(amount>balance){
        System.out.println("insufficient balance");
    }
    else if(amount <=0)
    System.out.println("plese enter valid amount");
    else{
        balance-=amount;
        System.out.println("amount withdrawl successfully");
    }
}
    public double getBalance(){
        return balance;
    }
}
