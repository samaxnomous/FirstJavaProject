package feb_01_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExercise1 {

	public static List<String> transformedList(List<String> stringList,Function<String,String> function){
		List<String> newTransformedStringList = new ArrayList<>();
		for(String ele : stringList) {
			String temp = function.apply(ele);
			newTransformedStringList.add(temp);
		}
		return newTransformedStringList;
	}
	public static void main(String[] args) {
		String[] words = {"jillo", "world"};
		System.out.println(transformedList(Arrays.asList(words), s -> s.replace("i", "eye")));
	}
	
}
