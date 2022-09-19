package java8;

class student{
	int roll;
	String name;
	static String college="fisat";
	student(int r , String n ){
		this.roll=r;
		this.name=n;
		
	}
	public void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}
}
public class thisnstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student a= new student(12,"akshay");
		a.display();
		student b= new student(28,"akshay");
		b.display();
		
	}

}
