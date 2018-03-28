package doicosotunhien10sangcosobatki;
import java.util.Scanner;
public class main {
	public static void doicoso(int n, int base) {
		if (n>=base) doicoso(n/base,base);
		if (n%base >9) System.out.printf("%c", n%base+5);
		else System.out.print((n % base));
	}
	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = false;
		int n=0;
		while(!check) {
			System.out.println(" ");
			try {
				n = input.nextInt();
				check = true;
				
			}catch (Exception e) {
				System.out.println("ban phai nhap so! Hay nhap lai");
				input.nextLine();
			}
		}
		return (n);
	}
	public static void main(String[] args) {
		System.out.println("Nhap n");
		int n=nhap();
		System.out.println("Nhap vao co so can chuyen qua b");
		int b = nhap();
		System.out.println("So" +n+ "chuyen sang co so" +b+ "thanh:");
		doicoso(n,b);
	}

}
