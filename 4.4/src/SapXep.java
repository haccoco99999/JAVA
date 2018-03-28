import java.io.*;
public class SapXep {
	static int day[];
	static void nhap() {
	String str;
	int n=day.length;
	DataInputStream stream = new DataInputStream(System.in);
	System.out.println("Nhap vao" +n+ "so nguyen");
	for(int k=0; k<n; k++) {
		try {
			System.out.println(k+":");
			str = stream.readLine();
			day[k] = Integer.valueOf(str).intValue();
		}catch(IOException e) {
			System.err.println("I/O Error!");
		}
	}
	}
	static void hienThi() {
		int n=day.length;
		for(int k=0; k<n; k++) 
			System.out.println(day[k] + " ");
		System.out.println();
	}
	static void sapXep() {
		int x,max,k;
		for(int i=day.length-1; i>0; i--) {
			max = day[i]; k=i;
			for(int j=0;j<i;j++)
				if (max < day[i]) {
					max=day[i];
					k=j;
				}
			day[k]=day[i];
			day[i]=max;
		}
	}
	public static void main(String[] args) {
		String str;
		int n;
		DataInputStream stream = new DataInputStream(System.in);
		System.out.println("\nCho biet bao nhieu so nhap vao:");
		try {
			str=stream.readLine();
		}catch(IOException e) {
			System.err.printf("I/O Error!");
			str="0";
		}
		n=Integer.valueOf(str).intValue();
		SapXep.day = new int[n];
		nhap();
		sapXep();
		System.out.println("Day so duoc sap xep:");
		hienThi();
	}

}
