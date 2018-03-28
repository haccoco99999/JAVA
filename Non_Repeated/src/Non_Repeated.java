import java.util.Scanner;
public class Non_Repeated {
	public static void main(String[] args) {
		int n, flag = 0, cout = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		n= s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i=0; i< n; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Non repeated elements are:");
		for (int i = 0; i< n; i++)
		{
			for(j =0; j < n; j++)
			{
				if( i!= j)
				{
					flag = 1;
				}
				else 
				{
					flag = 0;
					break;
				}
			}
		}
		if (flag ==1)
		{
			count++;
			System.out.println(a[i]+" ");
		}
	}
	System.out.print("");
	System.out.print("Number of non repeated elements are:"+count);

}
