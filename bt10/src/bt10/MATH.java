package bt10;
import java.util.Scanner;
public class MATH {
	public static void main(String[] args) {
		int n;
		int i = 1;
		int tich=1;
		Scanner input= new Scanner(System.in);
		System.out.println("Nhap vao n");
		n=input.nextInt();
		while (n < 6) {
			System.out.println("Nhap lai n vi sai dieu kien:");
			n=input.nextInt();
		}
		while (n>=6) {
			tich *= i;
			i++;
			System.out.println("Tich la:" + tich);
		}
	}

}
