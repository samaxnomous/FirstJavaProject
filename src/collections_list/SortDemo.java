package collections_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import temp.ChemicalElements;

public class SortDemo {
	
	public static String[] strings = {"this","is","a","bunch","of","bizzare","words","like","xylophone"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demoSimpleSortOfStrings();
		
		demoSortOfUserDefinedClass();
		
	}

	private static void demoSortOfUserDefinedClass() {
		// TODO Auto-generated method stub
		ChemicalElements h = new ChemicalElements("Hydroger","H",1);
		ChemicalElements k = new ChemicalElements("Potassium","K",19);
		ChemicalElements o = new ChemicalElements("Oxygen","O",8);
		ChemicalElements zn = new ChemicalElements("Zinc","Zn",30);
		
		List<ChemicalElements> cList = new ArrayList<>();
		cList.add(h);
		cList.add(k);
		cList.add(o);
		cList.add(zn);
		
		Collections.sort(cList, new ChemicalElementsSortByAtomic());
		System.out.println(cList);
	}

	private static void demoSimpleSortOfStrings() {
		
		/*
		 List<String> wordList = Arrays.asList(strings);
		 Collections.sort(wordList);
		 System.out.println(wordList);
		 */
		 Arrays.sort(strings);
		 System.out.println(Arrays.asList(strings));
	}

}
