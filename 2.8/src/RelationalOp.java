public class RelationalOp {
	public static void main (String [] args) {
		float a=10.0f;
		double b=10.0;
		if (a==b)
			System.out.println(a + "va" + b + "bang nhau");
		else
			System.out.println(a + "va" +b+ "khac nhau nhau");
		String s1 = "Lap trinh";
		String s2 = new String ("lap trinh");
		if (s1 == s2)
			System.out.println("s1 va s2 la 2 doi tuong dong nhat");
		else
			System.out.println("s1 va s2 la 2 doi tuong khong dong nhat");
		if (s1.equals(s2))
			System.out.println("s1 va s2 la 2 doi tuong co cung gia tri");
		else
			System.out.println("s1 va s2 la 2 doi tuong khong cung gia tri");
	}

}
