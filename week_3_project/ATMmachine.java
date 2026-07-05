package week_3_project;

import java.util.Scanner;

public class ATMmachine {
    private BankAccount account;
    public ATMmachine(BankAccount account){
        this.account=account;
    }
    private Scanner sc=new Scanner(System.in);
    
    public void start(){
        int choice;
        do{
            System.out.println("\n ====== ATM MENU ====== ");
             System.out.println(" PRESS 1 FOR WITHDRAWL");
              System.out.println("PRESS 2 FOR DEPOSITE ");
               System.out.println("PRESS 3 FOR CHECK BALANCE");
                System.out.println("PRESS 4 FOR EXIT ");

                choice=sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("Enter the amount for withdrawl");
                    account.withdrawlBalance(sc.nextDouble());
                    break;
                    case 2:
                    System.out.println("Enter the amount you want to deposite");
                    account.depositeBalance(sc.nextDouble());
                    break;
                    case 3:
                    System.out.println("your total balance is: "+account.getBalance());
                    break;
                    case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                   
                    default:
                    System.out.println("invalid choice, Try again");
                }
        }while(choice!=4);
        
    }
}
