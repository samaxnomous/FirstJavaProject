package feb_01_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExercise1 {

	public static List<String> allMatches(List<String> stringList, Predicate<String> function){
		List<String> newStringList = new ArrayList<>();
		for(String ele: stringList) {
			if(function.test(ele)) {
				newStringList.add(ele);
			}
		}
		return newStringList;
		
	}
	public static void main(String[] args) {
		String[] stringList = {"this","is","exercise","on","predicate","functional","interface"};
		
		List<String> shortWords = allMatches(Arrays.asList(stringList), s->s.length()<4);
		List<String> wordsWithB = allMatches(Arrays.asList(stringList), s->s.contains("b"));
		List<String> evenLengthWords = allMatches(Arrays.asList(stringList), s->(s.length()%2)==0);
		
		System.out.println(shortWords);
		System.out.println(wordsWithB);
		System.out.println(evenLengthWords);
	}

}
