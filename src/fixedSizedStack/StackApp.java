package fixedSizedStack;

public class StackApp {

	public static void main(String[] args) {
		
		FixedArrayStack arrayStack = new FixedArrayStack(10);
		DynamicSizedStack listStack = new DynamicSizedStack();
		
		StackUser user = new StackUser();
		user.fill(arrayStack);
		user.empty(arrayStack);
		
		user.fill(listStack);
		user.empty(listStack);
	}

}
