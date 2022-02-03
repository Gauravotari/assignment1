package basicprogram;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		int num,rev,cpy,r;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		cpy=num; 
		rev=0;
		for(;num!=0;)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println(rev+" is a reverse number of" +cpy);
		

	}

}
