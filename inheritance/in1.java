package inheritance;
interface drawable{
	void draw();
}

class rec implements drawable{
	public void draw()
	{
		System.out.println("DRAWING RECTANGLE");
	}
}


class cir implements drawable{
	public void draw()
	{
		System.out.println("DRAWING CIRCLE");
	}
}

public class in1 {

	public static void main(String[] args) {
			drawable d = new rec();
			d.draw();

	}

}
