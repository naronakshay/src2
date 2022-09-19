package java8;
import java.util.*;
public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> s = new ArrayList<String>();
		
		s.add("AKSHAY");
		s.add("ANU");
		s.add("APPU");
		s.add("ADHWAITH");
		
		Long n = s.stream().filter(str->(str.length()>5)).count();
		System.out.println(n);
		
	}

}
