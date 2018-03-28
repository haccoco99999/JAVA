// một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.Liệt kê.
package bt17;
import java.util.Scanner;
public class main {
	public static boolean testSoThuanNghich(int n) {
		StringBuilder xau=new StringBuilder();
		String str= ""+n;
		xau.append(str);
		String check=""+xau.reverse();//đảo ngược
		if(str.equals(check)) return true;
		else return false;
	}
	public static void main(String[] args) {
		int n, count = 0;
		for(n=100000; n<=999999;n++) {
			if(testSoThuanNghich(n)) {
				System.out.println(n); 
				count++;
			}
		}
		System.out.println("Co" +count+"so thuan nghich co 6 chu so");
	}

}
