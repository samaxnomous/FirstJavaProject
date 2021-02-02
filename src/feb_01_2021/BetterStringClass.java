package feb_01_2021;

public class BetterStringClass {

	public static String betterString(String s1,String s2,TwoStringPredicate obj) {
		if(obj.isFirstBetterThanSecond(s1, s2))
			return s1;
		return s2;
	}
	
	public static void main(String[] args) {
		String lengthier = betterString("hello","worldOfJava",(s1,s2)->s1.length()>s2.length());
		//if we haven't used betterString function which implement the TwoStringPredicate
		//then we would have to pass the lambda as a block
		// (s1,s2) -> {
//				if (s1.length()>s2.length())
//					return s1;
//				return s2;
//			}
		// which is not recommended in lambda as it is considered a one liner expression
		System.out.println(lengthier);
	}
	
}
