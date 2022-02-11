package stARPATTERN;

public class starpattern1 {

	public static void main(String[] args) {
		int i,j,k,r;
      for(i=1;i<5;i++)
        {
        for(j=1;j<=i;j++)
        {
        	System.out.print("  ");
        }
        for(k=5;k>i;k--)
        {
        	System.out.print("* ");
        }
        for(r=5;r>=i;r--)
        {
        	System.out.print("* ");
        }
       System.out.println(); 
       }
       for(i=1;i<=5;i++)
        {
        for(j=5;j>=i;j--)
        {
        	System.out.print("  ");
        }
        for(k=1;k<i;k++)
        {
        	System.out.print("* ");
        }
        for(r=1;r<=i;r++)
        {
        	System.out.print("* ");
        }
        System.out.println();
        
        
        }
	}

}
