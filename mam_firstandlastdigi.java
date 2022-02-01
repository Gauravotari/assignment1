package basicprogram;

import java.util.Scanner;

public class mam_firstandlastdigi {
	public static void main(String args[]) {
		int num,sum,firstdigit,lastdigit;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number:");
		num=sc.nextInt();
		//calculating last digit
		lastdigit=num%10;
		
		System.out.println("last digit=" +lastdigit);
		
		//calculating first digit
		for (;num>=10;) //10>=10 tr
		{
			num=num/10;
		}
		
		//store the first digit from num to firstdigit variable
		firstdigit=num;
		System.out.println("first digit :"+firstdigit);
		System.out.println("sum of the first and last digit :"+(firstdigit+lastdigit));
			
	}

}
