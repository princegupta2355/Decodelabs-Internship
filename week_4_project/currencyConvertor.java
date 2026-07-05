package week_4_project;
import java.util.Scanner;
public class currencyConvertor {

    Scanner sc=new Scanner(System.in);
        int choice;
        double amount;

    void begains(){
        do{
         System.out.println("Enter the amount");
         amount=sc.nextDouble();
        System.out.println("\n====== CURRENCY CONERTOR ======");
        System.out.println("Press 1 for USD to INR");
        System.out.println("Press 2 for INR to USD");
        System.out.println("Press 3 for EURO to INR");
        System.out.println("Press 4 for INR to EURO");
        System.out.println("Press 5 for exit");
        
        choice=sc.nextInt();

        switch(choice){
        case 1:
         System.out.println("USD "+amount+" is equal to "+ amount*95.22+" INR");
         break;
    
         case 2:
         System.out.println("INR "+amount+" is equal to "+amount/95.22+" USD");
         break;

         case 3:
         System.out.println("EURO "+amount+" is equal to "+amount*108.89+" INR");
         break;

         case 4:
         System.out.println("INR "+amount+" is equal to "+amount/108.89+" EURO");
         break;
          
         case 5:
         System.out.println("Thank you for using currency convertor");
         break;

         default:
         System.out.println("Invalid input, press valid input");
        }
    }while(choice!=5);

    }
}
