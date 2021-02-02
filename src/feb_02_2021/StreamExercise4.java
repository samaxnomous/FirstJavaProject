package feb_02_2021;

import java.util.Arrays;
import java.util.List;

public class StreamExercise4 {
	public static void main(String[] args) {
		String[] stringList = {"hi","hello","this","is","a","stream","exercise"};
		List<String> words = Arrays.asList(stringList);
		
		words.stream().filter(s->s.length()<4).forEach(System.out::println);
		words.stream().filter(s->s.contains("i")).forEach(System.out::println);
		words.stream().filter(s->(s.length()%2)==0).forEach(System.out::println);
	}
}
