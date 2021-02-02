package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassAuthorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAuthorComparator user1 = new ClassAuthorComparator(1,"Sayan");
		ClassAuthorComparator user2 = new ClassAuthorComparator(2,"Maity");
		ClassAuthorComparator user3 = new ClassAuthorComparator(3,"Bapi");
		ClassAuthorComparator user4 = new ClassAuthorComparator(4,"Demo");
		
		List<ClassAuthorComparator> listOfClassAuthorObject = new ArrayList<ClassAuthorComparator>();
		listOfClassAuthorObject.add(user1);
		listOfClassAuthorObject.add(user2);
		listOfClassAuthorObject.add(user3);
		listOfClassAuthorObject.add(user4);
		
		System.out.println(listOfClassAuthorObject);
		
		Collections.sort(listOfClassAuthorObject);
		
		System.out.println(listOfClassAuthorObject);
		
		//----------------------------------------------------------------
		// Sorting ClassUserComparator
		
		ClassUserComparator newUser1 = new ClassUserComparator(1,"SayanNew");
		ClassUserComparator newUser2 = new ClassUserComparator(2,"MaityNew");
		ClassUserComparator newUser3 = new ClassUserComparator(3,"BapiNew");
		ClassUserComparator newUser4 = new ClassUserComparator(4,"DemoNew");
		
		List<ClassUserComparator> listOfClassUserObject = new ArrayList<ClassUserComparator>();
		listOfClassUserObject.add(newUser1);
		listOfClassUserObject.add(newUser2);
		listOfClassUserObject.add(newUser3);
		listOfClassUserObject.add(newUser4);
		
		
		System.out.println(listOfClassUserObject);
		
		Collections.sort(listOfClassUserObject,new ClassUserObjectsComparing());
		
		System.out.println(listOfClassUserObject);
		
		
		
	}

}
