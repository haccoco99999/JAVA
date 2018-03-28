package test1;
public class Circle {
	public static void main(String[] args)throws Exception
	{
	int num;
	System.out.println("Enter a number between 10 and 20:",num);
	num=MyInput.readInt();

	if(num>10 && num<20)
	{System.out.println("You have entered a valid number");}

	else
	{System.out.println("The number you entered is not a valid number");}

	} 
}
