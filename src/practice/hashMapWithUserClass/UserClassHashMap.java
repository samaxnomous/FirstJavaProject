package practice.hashMapWithUserClass;

import java.util.HashMap;

import comparator.ClassUserComparator;

public class UserClassHashMap {
	public static void main(String[] args) {
		HashMap<ClassUserComparator,Double> userScores  = new HashMap<>();
		
		ClassUserComparator newUser1 = new ClassUserComparator(1,"SayanNew");
		ClassUserComparator newUser2 = new ClassUserComparator(2,"MaityNew");
		ClassUserComparator newUser3 = new ClassUserComparator(3,"BapiNew");
		ClassUserComparator newUser4 = new ClassUserComparator(4,"DemoNew");
		
		userScores.put(newUser1,85D);
		userScores.put(newUser2,75D);
		userScores.put(newUser3,65D);
		userScores.put(newUser4,55D);
		
		int searchId = 3;
		 
		ClassUserComparator searchUser = new ClassUserComparator(3,null);
		System.out.println(userScores.containsKey(searchUser));
		
	}
}
