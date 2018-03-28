
public class SoHoc {
	public static void main(String args [] ) {
		int p = 5,q = 12, r = 20,s;
		System.out.println("p =" + p + "," + "q =" + q + "," +"r =" + r);
		s = p + q;
		System.out.println("p + q =" + s);
		s= p % q;
		System.out.println("p % q =" + s);
		s *=r;
		System.out.println("s*=r" +s);
		System.out.println("Gia tri p truoc phep gia tang:" +p);
		p++;
		System.out.println("Gia tri p sau phep gia tang:" + p);
		System.out.println("Truoc khi thuc hien: s=p*++q\n p =" + p + "," + "q =" + q + "," + "s=" + s);
		s=p*++q;
		System.out.println("Sau khi thuc hien: s = p*++q\n p =" + p + "," + "q =" + q + "," + "s =" + s);
		double x =25.75;
		System.out.println("--x =" + x);
		System.out.println("Gia tri cua x++*s la:" + ++x);
		System.out.println("Gia tri cua x++*s la:" + x++*s);
		System.out.println("5/0.0 =" + 5/0.0);
		System.out.println("0/0.0 =" + 0/0.0);
		
	}

}
