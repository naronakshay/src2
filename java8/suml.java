package java8;
import java.util.*;
public class suml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l = new ArrayList();
		l.add(23);
		l.add(3);
		l.add(6);
		l.add(5);
		
		int sum= l.stream().mapToInt(i->i.intValue()).sum();
		System.out.println(sum);
		
	}

}
