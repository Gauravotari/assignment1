package basicprogram;

import java.util.Scanner;

public class perfectnumber1to100 {

	public static void main(String[] args) {
		int num,i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range:");
		num=sc.nextInt(); //100
		for (i=1;i<=num;i++) //4<=100
		{
			sum=0;
	    for (j=1;j<i;j++)
	    {//1<4
	    	if(i%j==0)   //4%i=0=0 tr
			{
				sum=sum+j; //2+1=3  /*sum+=i */ sum=3
						
			}
		} // end of inner loop
		if(sum==i)//i==2
			System.out.println(i);//6
	}//end of outer loop

		
		
		
	}

}
