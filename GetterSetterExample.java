package OOPsExample;

 class employee {
	 int id;
	 String name;
	 float sal;
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id =id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name= name;
	 }
	 public float getsal() {
		 return sal;
	 }
	 public void setSalary (float salary) {
		 this.sal= salary;
		}
	 @Override
	 public String toString() {
		 return "emp[id="  +id+" ,name="+name+",salary="+sal+"]";
	 }
 }
	 public class GetterSetterExample{
		 
		 public static void main(String[] args) {
			 employee e=new employee();
			 e.setId(10);
             e.setName("gaurav");
             e.setSalary(10000);
             System.out.println(e);
 }
 
	 
 }


