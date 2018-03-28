import java.util.Scanner;
public class problem1 {
	public static void main(String[] args) {
		int budget,items=0,price=0;
		System.out.println("Please enter your budget:");
		Scanner s = new Scanner(System.in);
		budget = s.nextInt();
		while(budget>0)
		{
			System.out.println(" Please enter your items ad prices:");
			Scanner ss = new Scanner(System.in);
			items=ss.nextInt();
			price = ss.nextInt();
			budget -= items*price;
		}
		if (budget <=0)
		{
			budget += price * items;
			System.out.println("You cannot buy the last item");
			System.out.println("Your remain budget:" +budget);
		}
	}

}
