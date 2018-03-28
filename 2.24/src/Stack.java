class EmptyStack extends Exception {}
class FullStack extends Exception {}
public class Stack {
	int doCao;
	Object danhSach[];
	Stack() { init(200);}
	Stack (int n) {init(n);}
	void init(int n) {
		doCao = 0;
		danhSach = new Object[n];
	}
	void push(Object x) throws FullStack {
		if (danhSach.length == doCao) throw new FullStack();
		danhSach[doCao ++] = x;
	}
	Object pop() throws EmptyStack {
		if (danhSach.length == doCao) throw new EmptyStack();
		return (danhSach[--doCao]);
	}
public class PTCuPhap{
	void BieuThuc() {
		Stack s = newStack;
		try {
			s.push(x); //x la hang thuc
		} catch (FullStack e) {
			System.err.println("Stack rong");
			abort(); //thoat ra
		}catch (AnyOtherExcepton er) {
			//Xu ly cac ngoai le khac
		}
	}
}
}
