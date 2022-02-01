package basicprogram;

import java.util.Scanner;

public class numberofdigits {

	public static void main(String[] args) {
		int count,num;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		count=0;
		for (;num!=0;)
		{
			num=num/10;
			count++;
		}
		System.out.println("count  of digits in given number"+count);
		
	}

}
