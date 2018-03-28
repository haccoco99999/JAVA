package bt1;
import java.util.Scanner;
public class Number {
	public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	int n,i=0;
	int m[]=new int[50];
	System.out.println("Nhap so nguyen:");
	n=s.nextInt();
	System.out.println("Day nhi phan la:");
	while(n!=0) {
		m[i]=n%2;
		n=n/2;
		i++;
	}
	System.out.println();
	for(int j=i-1;j>=0;j--)
		System.out.println(m[j]);
}
}
