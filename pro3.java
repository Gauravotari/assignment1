import java.util.Scanner;
class pro3
{
      public static void main(String xy[])
      {
           int num1,num2,multi,add,sub,div;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter first number");
           num1=sc.nextInt();
           System.out.println("enter second number");
           num2=sc.nextInt();
           multi=num1*num2;
           System.out.println("the multiplicationn is ="+multi);
           
           add=num1+num2;
           System.out.println("the addition is ="+add);

           sub=num1-num2;
           System.out.println("the subsraction is ="+sub);

           div=num1/num2;
           System.out.println("the division is ="+div);

           mod=num1%num2;
           System.out.println("the mod is ="+mod);

      }
}
           