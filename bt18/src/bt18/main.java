// viết chương trình liệt kê các xâu nhị phân độ dài n
package bt18;
import java.util.Scanner;
public class main {
	public static int nhap() {
		Scanner input=new Scanner(System.in);
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
		int[]array=new int[n];
		int tich;
		do {
			tich=1;
			//in ra và tính tích các phần tử trong mảng
			System.out.println("");
			for(int j=0; j<n;j++) {
				System.out.println(" "+array[j]);
			}
			int i=n-1;
			do {
				if(array[i]==0) {
					array[i]=1;
					for(int j=n-1; j>i;j--) {
						array[j]=0;
					}
					break;
				}
				else i--;
			} while(i>=0);
		}while(tich!=1);
}
}
