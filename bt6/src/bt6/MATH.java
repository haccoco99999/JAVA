package bt6;
import java.util.Scanner;
public class MATH {
	public static void main(String[] args) {
		float n;
		float tong=0.0f;
		Scanner input = new Scanner(System.in);
		System.out.println("nhap vao n");
		n=input.nextInt();
		if(n>=9) {
			for (int i = 1;i<=n;i++) {
				tong +=(float) 1/(2*i);
			}System.out.println("Tong day so la = " + tong);
		}else {System.out.println("Sai dieu kien");}
	}

}
