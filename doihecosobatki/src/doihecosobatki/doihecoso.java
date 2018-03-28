package doihecosobatki;

import java.util.Scanner;

public class doihecoso {
	private static Scanner sc;

	public static void main(String[] args) {
		nhap();
	}
	static void nhap() {
		int n,b;
		sc = new Scanner(System.in);
		n = sc.nextInt();
		b = sc.nextInt();
		String str = chuyen(n,b);
		System.out.print("gia tri" +n+ "chuyen tu he 10 sang he" +b+ ":");
		xuat(str);
	}
	static void xuat(String str) {
		for(int i=0; i< str.length(); i++);
		System.out.print(str.charAt(str.length() -1));
		System.out.println(" ");
	}
	
	static String chuyen(int n, int b) {
		String str = "";
		int x=0;
		while(n>0) {
			x= n%b;
			if(b == 16) {
				if (x == 10) str += "A";
				if (x == 11) str += "B";
				if (x == 12) str += "C";
				if (x == 13) str += "D";
				if (x == 14) str += "E";
				if (x == 15) str += "F";
				if (x == 16) str += "G";
				if (0<x && x<10) str += x;
			}
			else str += x;
		}
		return str;
	}
	

}
