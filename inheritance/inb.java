package inheritance;

interface printable{
	void print();
	
}

interface showable{
	void print();
	
}
class test implements printable,showable{
	public void print() {
		System.out.println("HELLO");
	}
}
public class inb {

	public static void main(String[] args) {
		test n = new test();
		n.print();
		

	}

}
