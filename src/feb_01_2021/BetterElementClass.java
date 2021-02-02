package feb_01_2021;

public class BetterElementClass {

	public static <T> T betterElement(T element1,T element2,TwoElementPredicate<T> obj) {
		if(obj.isFirstBetterThanSecond(element1, element1))
			return element1;
		
		return element2;
	}
	
	public static void main(String[] args) {
		
		String betterOne = betterElement("hello","betterElement" ,(element1,element2) -> element1.length() > element2.length());
		System.out.println(betterOne);
	}

}
