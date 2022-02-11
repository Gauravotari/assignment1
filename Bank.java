package OOPsExample;

public class Bank {
	int accno;
	String holdername;
	long accbalance; //10000 5000
	
	//constructor
	//no-args or default constructor
	//parameterized constructor
	
	public Bank (int accno,String holdername,long accbalance)
	{
		
		this.accno=accno;
		this.holdername=holdername;
		this.accbalance=accbalance;
		
	}
	public void desposit(long amount)
	//public void withdraw (long amount) //5000
	{
		if ((amount<accbalance)&& (amount>=500))
		{
			accbalance=accbalance+amount; //10000-5000-5000 this is for withdraw accbalance-amounnt
			System.out.println(amount +"debited has done sucessfully");//(amount +" withdraw has done successfully");
			
		}
		else
		{
			System.out.println("only accept amount more than 500");     //("Insufficient balance! deposite first");
		}
		
	}
	public void deposit(long amount)
	{
	accbalance=accbalance+amount; 
	System.out.println(amount +"debited has done sucessfully");
	}
	public void checkBalance()
	{
		System.out.println("account no:" +this.accno);
		System.out.println("account Holder name:" +this.holdername);
		System.out.println("account balance:" +this.accbalance);

		
	}

}
