package Input;
import MyInput;
public class CheckNumber {
	public static void main(String args []) {
	int num = MyInput.readInt();
	if (num %2 ==0)
		System.out.println(num + "la so chan");
	else
		System.out.println(num + "la so le");
}

}
