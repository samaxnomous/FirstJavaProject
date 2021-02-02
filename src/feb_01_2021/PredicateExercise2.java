package feb_01_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExercise2 {

	public static <T> List<T> allMatches(List<T> elementList, Predicate<T> function){
		List<T> newElementList = new ArrayList<>();
		for(T ele: elementList) {
			if(function.test(ele)) {
				newElementList.add(ele);
			}
		}
		return newElementList;
		
	}
	public static void main(String[] args) {
		String[] stringList = {"this","is","exercise","on","predicate","functional","interface"};
		
		List<String> shortWords = allMatches(Arrays.asList(stringList), s->s.length()<4);
		List<String> wordsWithB = allMatches(Arrays.asList(stringList), s->s.contains("b"));
		List<String> evenLengthWords = allMatches(Arrays.asList(stringList), s->(s.length()%2)==0);
		
		System.out.println(shortWords);
		System.out.println(wordsWithB);
		System.out.println(evenLengthWords);
		
		System.out.println("----------------------------------------------------");
		
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = PredicateExercise2.allMatches(nums, n -> n>500);
		System.out.println(bigNums);
	}

}
