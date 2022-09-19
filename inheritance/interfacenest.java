package inheritance;

interface show1{
	void s();
	interface message{
		void msg();
}

}

class test3 implements show1.message{
	public void msg() {
		System.out.println("HELLO NESTED INTERFACE");
	}
}
public class interfacenest {

	public static void main(String[] args) {
		show1.message m = new test3();
		m.msg();
		
		

	}

}
