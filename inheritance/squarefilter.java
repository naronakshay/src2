package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class squarefilter {

	public static void main(String[] args) {
		List <Integer> l = new ArrayList();
		l.add(2);
		l.add(10);
		l.add(11);
		l.add(5);
		
		OptionalDouble av =l.stream().mapToInt(i-> i*i).filter(n->(n>100)).average();
		System.out.println(av);				
	}

}
