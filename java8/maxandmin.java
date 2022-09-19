package java8;
import java.util.Comparator;
import java.util.stream.Stream;

public class maxandmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer max= Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
		Integer min= Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max+" "+min);
	}

}
