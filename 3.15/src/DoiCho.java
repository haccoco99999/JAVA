//minh họa việc sử dụng một hàm muốn đổi hai giá trị số, nhưng vì truyền tham số theo giá trị nên khong thực hiện được.
public class DoiCho { // đổi 2 giá trị của 2 biến cho nhau
	public static void doiCho(int x, int y) {
		int t = x;
		x = y;
		y = t;}
	public static void main(String[] args) {
		int x=20;
		int y=3;
		System.out.println("Truoc khi doi cho x =" + x +",y = " +y);
		doiCho(x,y);
		System.out.println("Sau khi goi ham doiCho(): x =" +x+", y =" + y);
	}

}
