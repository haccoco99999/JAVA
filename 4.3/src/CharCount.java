
public class CharCount {
	public static void main(String[] args) {
		int [] countArr = new int[Character.MAX_VALUE];
		// mảng tất cả các kí tự
		String str = "Con cac";
		for (int i=0; i< str.length(); i++)
			try {
				countArr[str.charAt(i)]++;
				// đếm số lần xuất hiện của str.CharAt(i)
			}catch (StringIndexOutOfBoundsException e) {
				System.out.println("Loi chi so:" +i+e);
			}
		System.out.println("\tTan xuat cua cac ky tu trong\"" +str+ "\" la:");
		for(int i=0; i<countArr.length; i++)
			if(countArr[i]!=0)
				System.out.println("\t\t" +(char)i + ":" +countArr[i]);
	}

}
