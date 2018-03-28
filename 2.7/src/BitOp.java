
public class BitOp {
	public static void main (String [] args) {
		int x = 8,y=9;
		System.out.println(x + "&" +y+ "=" + (x&y));
		System.out.println(x + "|" +y+ "=" + (x|y));
		System.out.println(x + "^" +y+ "=" + (x^y));
		x =-31;
		System.out.println(x + ">>2 =" + (x>>y));
		System.out.println(x + "<<2 =" + (x<<y));
		System.out.println(x + ">>>2 =" + (x>>>y));
	}

}
