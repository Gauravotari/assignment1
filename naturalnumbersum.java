package basicprogram;

import java.util.Scanner;

public class naturalnumbersum {

	public static void main(String[] args) {
		int num,i,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		for (i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of number range from 1 to "+"num" +"is" +sum);

	}

}
