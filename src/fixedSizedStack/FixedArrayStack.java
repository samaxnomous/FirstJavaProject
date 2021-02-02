package fixedSizedStack;

public class FixedArrayStack implements Stack {
	public static int top = -1;
	Object[] stackArr;
	
	public FixedArrayStack(int size) {
		stackArr = new Object[size];
	}
	
	@Override
	public void push(Object ele) {
		stackArr[++top] = ele;
	}
	@Override
	public Object pop() {
		
		return stackArr[top--];
	}
}
