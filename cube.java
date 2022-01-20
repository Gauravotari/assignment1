package operator;

import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
	
		int num ,result;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter  number");
		num=sc.nextInt();
		result=(num*num*num);
		
		if (num%5==0)
		{
			System.out.println(result+"is the cube of given number");
		}
		else 
		{
			System.out.println(num+" is not divisible by 5");
		}
		
		}

 }
