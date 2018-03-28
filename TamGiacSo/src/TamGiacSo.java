import java.util.Scanner;
import static java.lang.Math.abs;
public class TamGiacSo {
	static void inSao(int n) {
		for (int i = 0;i < n; i++) {
			for(int j = 0;j < i+n; j++ ){
				if( j< n-1-i) System.out.print("  ");
				else {
					if(j == n-1)
						System.out.print(i+1);
					else {
					for(int k = 0; k<= i;k++)
						if( abs(j-n+1) == k) System.out.println(" "+ (i-k+1) +" ");
					}
				}
				System.out.println();
			}
			
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		inSao(n);
	}

}
