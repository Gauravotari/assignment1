package inehritanceexample;

 class Bank //parent /super/base
 {
	 String bankName;
	 
	 public  Bank (String bankName)
	 {
		 this.bankName=bankName;
	 }
	 public int intrest()
	 {
		return 8;
	 }
	 
 }
 class sbi extends Bank //child /sub/derived/extended class
 {
	 public sbi(String bankName) {
		 super (bankName);
	 }
	 void display()
	 {
		 System.out.println("Bank Name:  "+bankName);
	 }
	 
 }
 public class singleInheritanceExample{
	 public static void main(String [] args) {
		 sbi s=new sbi ("state bank of india");
		 s.display();
		 System.out.println("intrest: "+s.intrest() +"%");

	}

}
