package stARPATTERN;

import java.util.Scanner;

public class basicpattern {

	public static void main(String[] args) {
          int i,j,num;
          Scanner sc=new Scanner (System.in);
          System.out.println("enter the range number to print star:");
          num=sc.nextInt();
          
     for(i=1;i<=num;i++) 
          {
        for(j=1;j<=i;j++)
        {
        	System.out.print("* ");
        }
        System.out.println();
          }
    for(i=1;i<num;i++)
        {
       for(j=num;j>i;j--)
       {
    	   System.out.print("* ");
       }
        	  
	     System.out.println();
        }
}}
