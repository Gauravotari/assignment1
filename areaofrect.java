package operator;

import java.util.Scanner;

public class areaofrect {
	public static void main (String args[])
	{
		int l,b,area;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter  the values of length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
		System.out.println("area of rectangle "+area);
		
	}
	

}
