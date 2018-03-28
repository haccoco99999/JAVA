package bt15; // tách các số tự nhiên thành tích các số nguyên tố
import java.util.Scanner;
public class main {
	public static void phanTich(int n) {
		int i=2;
		while(n>1) {
			if(cachamchung.checkSNT(i)) {
				if(n%i==0) {
					System.out.println(i+" ");
					n/=i;
				}
				else i++;
			}
			else i++;
		}
	}
	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check  = false;
		int n=0;
		while (!check) {
			System.out.println(" ");
			try {
				n=input.nextInt();
				check = true;
			}catch(Exception e) {
				System.out.println("Ban phai nhap lai");
				input.nextLine();
			}
		}
		return(n);
	}
	public static void main(String[] args) {
		System.out.println("Nhap n");
		int n=nhap();
		System.out.println("n =");
		phanTich(n);
	}

}
