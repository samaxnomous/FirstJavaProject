package feb_01_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExercise2 {

	public static <T,R> List<R> transformedList(List<T> elementList,Function<T,R> function){
		List<R> newTransformedElementList = new ArrayList<>();
		for(T ele : elementList) {
			R temp = function.apply(ele);
			newTransformedElementList.add(temp);
		}
		return newTransformedElementList;
	}
	public static void main(String[] args) {
		String[] words = {"jillo", "world"};
		System.out.println(transformedList(Arrays.asList(words), s -> s.replace("i", "eye")));
		System.out.println(transformedList(Arrays.asList(words), String::toUpperCase));
		
		List<Integer> wordLengths = FunctionExercise2.transformedList(Arrays.asList(words), String::length);
		System.out.println(wordLengths);
	}
	
}
