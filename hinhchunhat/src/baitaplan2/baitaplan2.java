// tạo hình chữ nhật bằng dấu *
package baitaplan2;

import java.util.Scanner;

public class baitaplan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Nhao vao so hang so cot:");
		m=sc.nextInt();
		n=sc.nextInt();
		for (int i=0; i < m;i++ ) {
			for (int j=0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}
