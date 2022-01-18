package operator;

import java.util.Scanner;

public class DecimalToBinery_demo {
	          public static void main(String[]args)
	         {
	    	  Scanner sc=new Scanner (System.in);
	    	  System.out.println("enter a decimal number");
	    	  int num=sc.nextInt();
	    	  String b="";
	    	  int t=num;
	    	  while(t>0)
	    	  {
	    		  int r=t%2;
	    		  t=t/2;
	    		  b=r+b;
	    		  
	    	  }
	    	  System.out.println("binery equivalent of"+num+"is"+b);
	    		  
	    	  }
	    
}
