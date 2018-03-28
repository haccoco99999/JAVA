public class Stack {
	private Object[] StackArray;
	private int topOfStack;
	synchronized public void push (Object elem) {
		StackArray[++topOfStack] = elem;}
	synchronized public Object pop() {
		Object obj = StackArray[topOfStack];
		StackArray[topOfStack] = null;
		return obj;}
	//những hàm khác
	public Object peek() {
		return StackArray[topOfStack];
	}

}
