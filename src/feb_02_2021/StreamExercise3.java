package feb_02_2021;

import java.util.Arrays;
import java.util.List;

public class StreamExercise3 {
	public static void main(String[] args) {
		String[] stringList = {"hi","hello","this","is","a","stream","exercise"};
		List<String> words = Arrays.asList(stringList);
		
		words.stream().map(s->s+"!").forEach(System.out::println);
		words.stream().map(s->s.replace("i", "eye")).forEach(System.out::println);
		words.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
