package java8;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class api1 {
	
	public static void timep() {
		LocalTime t= LocalTime.now();
		LocalDate d=LocalDate.now();
		
		System.out.println("date:"+d);
		System.out.println("time:"+t);
		
		
	
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timep();
	}

}
