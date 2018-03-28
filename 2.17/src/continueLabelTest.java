import javax.swing.JOptionPane;
public class continueLabelTest {
	public static void main(String args []) {
		String output = "";
		nextRow: //nhãn đính của lệnh continue
		//Tính 5 dòng
		for (int row =1; row <=5; row++) {
		output +="\n";	
		//Lặp 10 cột trên dòng
		for (int column =1; column <=10; column++) {
			//Nếu số cột lớn hơn số dòng thì bắt đầu vòng lặp tiếp theo
			if (column > row)
				continue nextRow; //Vòng lặp tiếp của chương trình được đánh nhãn
			output += "*"; //Đưa * vào kết quả
		}//kết thúc vòng for bên trong
		}//kết thúc vòng for bên ngoài
		JOptionPane.showMessageDialog(null, output, "Chuong trinh su dung continue va label", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0); //thoát khỏi chương trình
	}// kết thúc main()
}//kết thúc lớp
