package atm;
import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        // TODO code application logic here
        int balance = 10000, withdrawal, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdrawal");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter the money to be withdrawn:");
                withdrawal = sc.nextInt();
                if(balance >= withdrawal)
                {
                    balance = balance - withdrawal;
                    System.out.println("Collect the money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    System.out.println("Check the balance before withdrawing");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter the money to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Money has been deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Available Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}