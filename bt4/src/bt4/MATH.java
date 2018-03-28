package bt4;
import java.util.Scanner;
public class MATH {
	public static void main(String[] args) {
		int n;
		int tong=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so n:");
		n=input.nextInt();
		if (n>=5 & n<=20) {
		for (int i = 1; i <= n; i++ ) {
			 
				tong +=(int) i;
				i++;
		}
				System.out.println("Tong day so la:" + tong);
	}else { System.out.println("Sai DK");}
}
}
		


