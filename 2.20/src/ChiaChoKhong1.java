public class ChiaChoKhong1 {
	public void chia(int n, int m) {
	try {
		System.out.println(n + "/" + m + " = " + (n/m));
	} catch (ArithmeticException e) {
		System.out.println("Gap phai loi:" +e);
	} finally {
		System.out.println("Nhung viec can thuc hien");
	}
	System.out.println("Ket thuc ham chia()");
	}
	public static void main(String args []) {
		int n = 20, m = 0;
		new ChiaChoKhong1().chia(n, m);
		System.out.println("Quay lai tu ham main");
	}

}
