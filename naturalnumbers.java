package basicprogram;

import java.util.Scanner;

public class naturalnumbers {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter range to natural number:");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
