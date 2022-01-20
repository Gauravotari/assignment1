package nestedoperator;

import java.util.Scanner;

public class nested_demo {
	public static void main(String args[])
	{
	 int num;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the  number:\n1)check given number is even or odd.\n2)check given number is greater or not.\n3)check given character is vowel or not\n4)display the day according  to you.");
	num=sc.nextInt();
	switch (num)
	{
	case 1:
	{
		int num1;
		System.out.println("enter the number: ");
		num1=sc.nextInt();
		
		if ((num1%2)==0)
{
		System.out.println("Given number is even"+num1);
}
	else 
	{
		System.out.println("given number is odd"+num1);
	}
}
	break;
	
	case 2:
	{
		int x,y,z;
		System.out.println("enter the three number");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if (x>y && x>z)
		{
			System.out.println(x+"is greater number");
		}
		else if (y>z && y>x)
		{
			System.out.println(y+" number is grater");
		}
		else if  (z>x && z>y)
		{
			System.out.println(z+" number is greater ");
		}
		else
		{
			System.out.println(" number are not distinct");
		}
	}
		
		break;
		
		case 3:
		{
			char val;
			System.out.println("enter the character");
			val=sc.next().charAt(0);
			switch (val)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				    System.out.println("its a vowel="+val);
		    break;
		     
		    default:
		    	System.out.println("its not a vowel="+val);
		    
			}
		}
		break;
		case 4:
		{
			int num3;
			System.out.println("enter the character");
			num3=sc.nextInt();
			switch(num3)
			{
			case 1:
				System.out.println("\nits a monday");
			case 2:
				System.out.println("\nits a tuesday");
			case 3:
				System.out.println("\nits a wednesday");
			case 4:
				System.out.println("\nits a thursday");
			case 5:
				System.out.println("\nits a friday");
			case 6:
				System.out.println("\nits a saturday");
			case 7:
			
			System.out.println("\nits a sunday");
				break;
				 
				default :
					System.out.println("\n is invaild ");
					
					break;
			}
		}
		break;
		default:
			System.out.println("\n is invalid ");
	}
	}
}

			
			
				
		
	
