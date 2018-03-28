package demo3;
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so number");
		int number = scanner.nextInt();
		if (number < 0) System.out.println("loai");
		else System.out.println("Nhan");
	}

}
