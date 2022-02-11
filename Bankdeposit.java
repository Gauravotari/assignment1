package OOPsExample;

public class Bankdeposit {
	int accno;
	String holdername;
	long accbalance; //10000 5000
	
	public Bankdeposit (int accno,String holdername,long accbalance)
{
		
		this.accno=accno;
		this.holdername=holdername;
		this.accbalance=accbalance;
}
	public void deposit(int amount)
	{
	accbalance=accbalance+amount; 
	System.out.println(amount +"debited has done sucessfully");
	}
	public void checkBalance(){
	{
		System.out.println("account no:" +this.accno);
		System.out.println("account Holder name:" +this.holdername);
		System.out.println("account balance:" +this.accbalance);
	}
	
	}

}
