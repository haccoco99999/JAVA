interface IStack{
	void push(Object item);
	Object pop();
}
// xây dựng lớp cài đặt isstack
class StackImpl implements IStack{
	protected Object[] stackArray; //bổ sung mảng đối tượng 
	protected int tos;
	public StackImpl (int capacity) {
		stackArray = new Object [capacity];
		tos = -1;
	}
	public void push(Object item) { // cài đặt hàm push()
		stackArray [++tos] = item;
	} //cài đặt hàm pop()
	public Object pop() {
		Object obj = stackArray[tos];
		stackArray[tos] = null;
		tos--;
		return obj;
	} //bổ sung hàm peek
	public Object peek() {
		return stackArray[tos];
	}
}
//xây dwijng thêm interface IsafeStack kế thừa IStack để kieerma tra trạng thái của Stack đảm bảo an toàn khi thao tác
interface ISafeStack extends IStack{
	boolean isEmpty();
	boolean isFull();
}
// xây dựng lớp để cài đặt hàm của IafeStack
class SafeStackImpl extends StackImpl implements ISafeStack{
	public SafeStackImpl (int capacity) {super(capacity);}
	public boolean isEmpty() {return tos < 0;}
	public boolean isFull() {return tos==stackArray.length-1;}
}
// xây dựng lớp sử dụng các lớp và giao diện đã cài đặt ở trên
public class StackUser{
	public static void main(String[] args) {
		SafeStackImpl safe1 = new SafeStackImpl(80);
		StackImpl s1 = safe1;
		ISafeStack iSafe1 = safe1;
		IStack iS1 = safe1;
		Object obj = safe1;
		safe1.push("Khoa CNTT");
		s1.push("DHQG");
		System.out.println(iSafe1.pop());
		System.out.println(iS1.pop());
		System.out.println(obj.getClass());
	}
}



