import java.io.*;
import java.util.Scanner;
public class Prime {
	public static void prime (int n) {
		int lim,d,k,num;
		for (k = 2 ; k < n; k++) {
		d = 2;
		num = 0;
		lim = (int)Math.sqrt(k);
		while (d <= lim) {
			if (k % d == 0) { num ++;break ;}
			else d++;
		}
		if(num == 0)
			System.out.print(" " + k);
	}
	}

public static void main (String [] arg) {
	Scanner scan = new Scanner (System.in);
	System.out.print("cho biet N =");
	int n = scan.nextInt();
	System.out.println("Cac so nguyen to <" + n + "la:\n");
	prime(n);
	System.out.println();
}
}
