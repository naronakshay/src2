package java8;

import java.util.ArrayList;
import java.util.List;

public class foreach1 {

	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("ForEach Loop:");
        gamesList.forEach(games->System.out.println(games));

	}

}