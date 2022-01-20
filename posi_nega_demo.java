package operator;

import java.util.Scanner;

public class posi_nega_demo {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		if (num>0)
		{
			System.out.println(num+"is a positive number");
		}
		else
		{
			System.out.println(num+"is negavtive number");
		}
		
	}

}
