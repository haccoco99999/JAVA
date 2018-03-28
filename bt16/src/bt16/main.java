// dãy số fibonacci được định nghĩa như sau: F0=1, F1=1, Fn=Fn-1 +Fn-2 với n>=2.Viết chương trình tìm số fibonacci thứ n
package bt16;
import java.util.Scanner;
public class main {
	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check=false;
		int n=0;
		while(!check) {
			System.out.println(" ");
			try {
				n=input.nextInt();
				check=true;
			}catch(Exception e) {
				System.out.println("Ban phai nhap so! hay nhap lai");
				input.nextLine();
			}
		}
		return(n);
	}
	public static void main(String[] args) {
		System.out.println("Nhap n");
		int n=nhap();
		int[] f=new int[n+1];
		f[0]=1;
		f[1]=1;
		for(int i=2; i<=n;i++) {
			f[i] = f[i-1] + f[i-2];
		}
		System.out.println("So Fibonanci thu "+n+" la: f["+n+"]="+f[n]);
	}

}
