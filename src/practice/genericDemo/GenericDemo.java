package practice.genericDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		
		List<String> l2 = new ArrayList<>();
		
		l2.add("hello");
		l2.add("world");
	
		printList(l1);
		printList(l2);
	}

	private static <T> void printList(List<T> l1) {
		// TODO Auto-generated method stub
		for(T ele: l1) {
			System.out.println(ele);
		}
	}

}
