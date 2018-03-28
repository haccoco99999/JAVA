package switchcaseDemo;
import java.util.*;
public class switchCaseDemo {
	public static void main(String[] args) {
		String op;
		switchCaseDemo num1 = new switchCaseDemo();
		switchCaseDemo num2 = new switchCaseDemo();
		switchCaseDemo num = new switchCaseDemo();
		System.out.println("nhap dau vao:" + op);
		switch (op) {
		case "+": num = num1 + num2;
		System.out.println("%f%c%f = %f"+num1+op+num2+num);
		break;
		case "-": num = num1 - num2;
		System.out.println("%f%c%f = %f"+num1+op+num2+num);
		break;
		case "*": num = num1 * num2;
		System.out.println("%f%c%f = %f"+num1+op+num2+num);
		break;
		default: System.out.println("OP is not supported");
		break;
		}
		return;

	}
	
}
