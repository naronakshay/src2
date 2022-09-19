package java8;
import java.util.Arrays;
import java.util.stream.*;
public class arraystream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[] {90,20,33,4,55,2};
		Arrays.sort(a);
		IntStream s = Arrays.stream(a);
		s.forEach(System.out::println);
	}

}
