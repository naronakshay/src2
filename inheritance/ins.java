package inheritance;

interface show{
	void show();
	static int printable(int s)
	{
		return s*s;
	}
}

class b implements show{
	public void show() {
	System.out.println("hiii");
	}
}
public class ins {

	public static void main(String[] args) {
		b s = new b();
		s.show();
		System.out.println(show.printable(3));

	}

}
