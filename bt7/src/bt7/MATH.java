package bt7;
import java.util.Scanner;
public class MATH {
	public static void main(String[] args) {
		int n;
		float tong=0.0f;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		n=input.nextInt();
		if (n>=2) {
			for (int i = 0;i<=n;i++) {
				tong +=(float) 1/((2*i)+1);
			}System.out.println("Tong la:" + tong);
		}else {System.out.println("Sai dieu kien");}
	}

}
