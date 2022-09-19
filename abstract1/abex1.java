package abstract1;
abstract class parent {
	abstract void msg();
}
class c1 extends parent{
	void msg() {
		System.out.println("this is first subclass");
	}
}
class c2 extends parent{
	void msg() {
		System.out.println("this is second subclass");
	}
}

public class abex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent o = new c1();
		o.msg();
		parent o1 = new c2();
		o1.msg();
		
	}

}
