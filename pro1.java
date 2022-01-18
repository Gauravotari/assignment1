package operator;

import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
		 int n1,n2;
         Scanner sc=new Scanner (System.in);
         System.out.println("enter two numbers");
         n1=sc.nextInt();
         n2=sc.nextInt();
         
         n2+=n1;
         System.out.println("the n2-=n1 \n the value of n2="+n2);
         
         n2-=n1;
         System.out.println("the n2-=n1 \n the value of n2=" +n2);

         n2*=n1;
         System.out.println("the n2*=n1 \n the value of n2="+ n2);

         n2/=n1;
         System.out.println("the n2/=n1 \n the value of n2="+ n2);

         n2%=n1;
         System.out.println("the n2%=n1 \n the value of n2="+ n2);
     

	}

}
