import java.util.Scanner;
public class GaltoLit {
	public static void main(String[] args) { 
		double gallons;
		double liters;
		System.out.println("Nhap vao so gallon can doi:");
		Scanner input = new Scanner(System.in);
		gallons = input.nextDouble();
		liters = gallons * 3.7854;
		System.out.println("So lit da duoc doi tu" +  gallons  + "la"   +   liters);
	}

}
