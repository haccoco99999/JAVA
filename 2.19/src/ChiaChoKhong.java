public class ChiaChoKhong {
	public void chia(int n, int m) {
		try {
			System.out.println(m + "/" + m + "=" +(n/m));
		}   catch (ArithmeticException e) { //(1)
			System.out.println("Gap phai loi:" + e ); //(2)
		}
		System.out.println("Ket thuc ham chia () ");} //(3)
	public static void main(String args[] ) {
		int n = 30, m = 0;
		new ChiaChoKhong() .chia(n, m);//(4)
		System.out.println("Quay lai ham main!"); //(5)
	}
}
