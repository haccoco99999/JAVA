// các biến hằng ytong interface
interface Constants{
	double PI=3.14;
	String DON_VI_DT= "cm 2";
	String DON_VI_CV = "cm";
}

public class Tinh implements Constants {
	public static void main(String[] args) {
		double banKinh = 15.00;
		System.out.println("Dien tich hinh tron co ban kinh" +banKinh+ "la" +(PI*banKinh*banKinh) + DON_VI_DT);
		System.out.println("Chu vi hinh tron co ban kinh" +banKinh+"la" +(2*PI*banKinh) +Constants.DON_VI_CV);
	}
	

}
