import java.net.StandardSocketOptions;

class Node{
	private Object duLieu; //Trường dữ liệu
	private Node next; //Node tiếp theo
	public Node(Object obj, Node link) { //phương thức tạo lập
		duLieu = obj;
		next = link;
	}
	//các hàm truy cập vào tahnhf phần ch dấu
	public void setDL(Object obj) {duLieu = obj;}
	public Object getDL() {return duLieu;}
	public void setNext(Node node) {next = node;}
	public Node getNext() {return next;}
}
class List{
	protected Node dau = null;
	protected Node duoi = null;
	public void insertInFront(Object obj) {
		if (isEmpty()) dau = duoi = new Node(obj,null);
		else dau = new Node(obj,dau);
	}
	public void insertAtBack(Object obj) {
		if(isEmpty()) dau = duoi = new Node(obj,null);
		else {duoi.setNext(new Node(obj,dau));
		duoi = duoi.getNext();}
		}
	public Object deletefront() {
		if (isEmpty()) return null;
		Node removed = dau;
		if(dau==duoi) dau = duoi = null;
		else dau = dau.getNext();
		return removed.getDL();
	}
	public boolean isEmpty() {return dau == null;}
}
class Queue{
	private List qlist;
	public Queue() {
		qlist = new List();
	}
	public void enqueue(Object item) {
		qlist.insertAtBack(item);
	}
	public Object dequeue() {
		if(empty()) return null;
		else return qlist.deletefront();
	}
	public Object peek() {
		Object obj = dequeue();
		if (obj != null) qlist.insertInFront(obj);
		return obj;
	}
	public boolean empty() {return qlist.isEmpty();}
}
class Stack extends List{
	public void push (Object obj) {insertInFront(obj);}
	public Object pop() {
		if(empty()) return null;
		else return deletefront();
	}
	public Object peek() {
		return isEmpty() ? null: dau.getDL();
	}
	public boolean empty() {return isEmpty();}
}


public class KhachHang {
	public static void main(String[] args) {
		String xau1 = "Chung ta dang xep hang!";
		int leng = xau1.length();
		Queue q = new Queue();
		int leng = 0;
		for(int i=0; i<leng; i++)
			q.enqueue(new Character(xau1.charAt(i)));
		while (!q.empty())
			System.out.println((Character)q.dequeue());
		System.out.println();
		String xau11 = ".pex nagn o gnad at gnuhC";
		String xau2 = null;
		int leng2 = xau2.length();
		Stack s = new Stack();
		for (int i = 0; i < leng2; i++)
			s.push(new Character (xau2.charAt(i)));
		while(!s.empty())
			System.out.println((Character)s.pop());
		System.out.println();
		
	}

}
