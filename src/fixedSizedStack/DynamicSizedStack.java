package fixedSizedStack;

import java.util.ArrayList;
import java.util.List;

public class DynamicSizedStack implements Stack{
	List<Object> l1 = new ArrayList<>();

	@Override
	public void push(Object ele) {
		l1.add(ele);
		
	}

	@Override
	public Object pop() {
		return "popping from dynamic stack"+l1.remove(l1.size()-1);
	}
	
}
