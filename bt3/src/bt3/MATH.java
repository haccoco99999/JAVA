package bt3;
import java.util.Scanner;
public class MATH {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
int n;
float tong=0.0f;
Scanner input = new Scanner(System.in);
System.out.println("Nhap so n:");
n=input.nextInt();
if (n>=7) {
for (int i = 1; i <= n; i++) {
	
tong+=(float) 1/i;
}
System.out.println("tong day so la: " + tong);
}else { System.out.println("Sai DK");}
}
}
