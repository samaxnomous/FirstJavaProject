package feb_02_2021;

import java.util.Arrays;
import java.util.List;

public class StreamPart2Exercise3{
	public static void main(String[] args) {
		String[] stringList = {"hi","hello","this","is","a","stream","exercise"};
		List<String> words = Arrays.asList(stringList);
		
		System.out.println(words.stream().reduce((s1,s2)->s1+","+s2).get());

	}
}
