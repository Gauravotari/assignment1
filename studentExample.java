package OOPsExample;

class student
{
	int id; //
    String name;
    float roll_no;
}
       
   public class studentExample{
	public static void main(String[] args) {
		student gaurav=new student(); //instance instantiate
		gaurav.id=102;
		gaurav.name="gaurav";
		gaurav.roll_no=3;
		System.out.println("id:"  +gaurav.id +"name: "+ gaurav.name+" "+"rollno:" +
        gaurav.roll_no);
	}

}
