package java8;

import java.util.Random;

public class randomsort {
	public static void pr() {
		Random r = new Random();
		r.ints(5).sorted().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr();
	}

}
