
public class ChiaChoKhong2 {
	public static void chia(int n, int m) {
	try {
		System.out.println(n + "/" + m + " = " +(n/m));
	}finally {
		System.out.println("Nhung viec can thuc hien");
	}
	System.out.println("ket thuc ham chia()");
	}
	public static void main(String args []) {
		int n = 20,m = 0;
		new ChiaChoKhong2().chia(n, m);
		System.out.println("Quay lai tu ham main");
	}

}
