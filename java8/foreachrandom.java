package java8;
import java.util.Random;
public class foreachrandom {
	public static void pr() {
		Random r = new Random();
		r.ints(5).forEach(System.out::println);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr();
	}

}
