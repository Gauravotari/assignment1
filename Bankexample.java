package OOPsExample;

import java.util.Scanner;

public class Bankexample {
	
     public static void main(String []args) 
     {
     long debit,accbalance;
     int accno;
     String holdername;
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter ac number:");
     accno=sc.nextInt();
     
     sc.nextLine();
     System.out.println("enter ac holder name:");
     holdername=sc.nextLine();
     
    System.out.println("enter ac balance:");
    accbalance=sc.nextLong();
    
    Bank gourav=new Bank(accno,holdername,accbalance);
    System.out.println("enter amount to deposit");
     debit=sc.nextLong();
     
     gourav.deposit(debit);
     gourav.checkBalance();
     }
}
