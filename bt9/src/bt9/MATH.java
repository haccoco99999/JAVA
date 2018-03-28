package bt9;
import java.util.Scanner;
public class MATH {
	public static void main(String[] args) {
		int n;
		int i = 1;
		float tong = 0.0f;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong n");
		n=input.nextInt();
		while (n<=5) {
			System.out.println("Nhap lai so n vi sai dieu kien:");
			n=input.nextInt();
		}
		while (i<=n) {
			tong += (float) ((2*i)+1)/((2*i)+2);
			i++;
		}System.out.println("Tong day so la:" + tong);
	}

}
