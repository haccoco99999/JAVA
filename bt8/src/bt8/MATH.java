package bt8;
import java.util.Scanner;
public class MATH {
	public static void main(String[] args) {
		int n;
		int i = 1 ;
		float tong=0.0f;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen");
		n=input.nextInt();
		while (n<=6) {
			System.out.println("Nhap lai so nguyen duong n");
			n=input.nextInt();
		}
		while (i<=n) {
			tong += (float) i/(i+1);
			i++;
		}System.out.println("Tong la = " + tong);
	}

}
