package temp;


public class ChemicalElements// implements Comparable<ChemicalElements>
{
	private String name, symbolicName;
	private int atomicNumber;
	private static boolean[] alkaliMetals = new boolean[120];
	
//	@Override
//	public int compareTo(ChemicalElements other) {
//		if(this.atomicNumber > other.atomicNumber)
//			return 1;
//		else if(this.atomicNumber < other.atomicNumber)
//			return -1;
//		else
//			return 0;
//	}
	
	static {
		alkaliMetals[3] = true;
		//do for other atomic number too.
	}
	
	public String toString() {
		
		return "Element:"+this.name+"||Symbol:"+this.symbolicName+"||Atomic:"+this.atomicNumber;
	}
	
	public ChemicalElements(String name, String symbolicName, int atomicNumber) {
		this.name = name;
		this.symbolicName = symbolicName;
		this.atomicNumber = atomicNumber;
	}

	public int getAtomicNumber() {
		return this.atomicNumber;
	}
	
	public boolean isAlkaliMetal() {

		return alkaliMetals[this.atomicNumber];
	}

	public boolean isTransitionMetal() {

		return false;
	}

	public boolean isMetal() {

		return false;
	}


}
