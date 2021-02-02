package lambda_expression;

import java.util.Arrays;

public class StringSortByLambda {
	public static String[] str = {"this","is","java","training","bootcamp","happening","on","saturday","trecking"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortByLength(str);
		sortByLengthReverse(str);
		sortByFirstChar(str);
		sortByCharE(str);
	}
	
	public static int checker(String s1,String s2) {
		
		if(s1.contains("e") && !s2.contains("e") )
			return -1;
		else if(!s1.contains("e") && s2.contains("e"))
			return 1;
		else
			return s1.compareTo(s2);
	}
	
	private static void sortByCharE(String[] str2) {
		// TODO Auto-generated method stub
		Arrays.sort(str,StringSortByLambda::checker);
		System.out.println(Arrays.asList(str));
	}
	private static void sortByFirstChar(String[] str2) {
		// TODO Auto-generated method stub
		Arrays.sort(str,(s1,s2) -> s1.charAt(0)-s2.charAt(0));
		System.out.println(Arrays.asList(str));
	}
	private static void sortByLength(String[] str) {
		// TODO Auto-generated method stub
		Arrays.sort(str,(s1,s2) -> s1.length()-s2.length());
		System.out.println(Arrays.asList(str));
	}
	private static void sortByLengthReverse(String[] str) {
		// TODO Auto-generated method stub
		Arrays.sort(str,(s1,s2) -> s2.length()-s1.length());
		System.out.println(Arrays.asList(str));
	}
	
	

}
