package comparator;

import java.util.Comparator;

public class ClassUserObjectsComparing implements Comparator<ClassUserComparator> {

	@Override
	public int compare(ClassUserComparator o1, ClassUserComparator o2) {
		return o2.getId() - o1.getId();
	}

}
