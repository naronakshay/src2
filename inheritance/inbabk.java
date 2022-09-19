package inheritance;
interface bank{
	float roi();
}

class sbi implements bank {
	public float roi() {
		return 9.15f;
	}
}
class pnb implements bank{
	public float roi() {
		return 9.7f;
	}
}

public class inbabk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new sbi();
		System.out.println("ROI :"+b.roi());
	}

}
