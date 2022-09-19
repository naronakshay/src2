package inheritance;
interface printable2{
	void print();
	
}

interface showable2 extends printable{
	void show();
	
}

class test2 implements showable{
	public void print() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("welcome");
	}
}
public class inex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 o=new test2();
		o.print();
		o.show();
	}

}
