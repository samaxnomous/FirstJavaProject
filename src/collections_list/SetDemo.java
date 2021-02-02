package collections_list;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoHashSet();
	}

	private static void demoHashSet() {

//		Set<String> uniqueWords = new HashSet<>();
		Set<String> uniqueWords = new LinkedHashSet<>();

		try (Scanner kb = new Scanner(System.in)) {

			while (true) {
				String aword = kb.nextLine();
				if (aword.equalsIgnoreCase("quit"))
					break;
				if (!uniqueWords.add(aword))
					System.out.println(aword + "=>already exists in set");

			}

			for (String s : uniqueWords) {
				System.out.println(s);
			}
		}

	}

}
