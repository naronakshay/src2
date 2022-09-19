package java8;
import java.util.stream.Stream;
import java.io.*;
public class iterate {

	public static void main(String[] args) {
		Stream <Integer> s=Stream.of(1,2,3,4,5);
		s.forEach(System.out::println);
	}

}
