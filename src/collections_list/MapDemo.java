package collections_list;

import java.util.HashMap;
import java.util.Map;

import temp.ChemicalElements;

/**
 * @author sm890
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demoSimpleMapOps();
		
		demoMapOfUserDefinedKeyType();
	}

	private static void demoMapOfUserDefinedKeyType() {
		// TODO Auto-generated method stub
		ChemicalElements o = new ChemicalElements("Oxygen","O",8);
		ChemicalElements k = new ChemicalElements("Potassium","K",19);
		
		Map<ChemicalElements,Double> earthComposition = new HashMap<>();
		
		earthComposition.put(o, 21D);
		
	}

	private static void demoSimpleMapOps() {
		// TODO Auto-generated method stub
		Map<String,Integer> runs = new HashMap<>();
		runs.put("Virat",100);
		runs.put("Spiderman",93);
		runs.put("Dhoni",96);
		
		System.out.println("Is there a batsman called Spiderman? "+runs.containsKey("Spiderman"));
		System.out.println("what non existing key returns ? "+runs.get("Pant"));
	}

}
