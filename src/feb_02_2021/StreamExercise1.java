package feb_02_2021;

import java.util.Arrays;
import java.util.List;

public class StreamExercise1 {
	
	public static void main(String[] args) {
		String[] stringList = {"hi","hello","this","is","a","stream","exercise"};
		List<String> words = Arrays.asList(stringList);
		
//		words.stream().forEach(System.out::println); //exercise 2
		words.stream().forEach(s-> System.out.println("  "+s+" "));	//exercise 1
	}
}
