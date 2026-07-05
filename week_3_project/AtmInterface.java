package week_3_project;
import java.util.Scanner;
public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the amount");
        BankAccount account=new BankAccount(sc.nextDouble());
        ATMmachine atm=new ATMmachine(account);
        atm.start();
        sc.close();
    }
}
