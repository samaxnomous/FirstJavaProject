package collections_list;

import java.util.Comparator;

import temp.ChemicalElements;

public class ChemicalElementsSortByAtomic implements Comparator<ChemicalElements> {
	
	@Override
	public int compare(ChemicalElements o1,ChemicalElements o2) {
		return o1.getAtomicNumber()-o2.getAtomicNumber();
	}

}
