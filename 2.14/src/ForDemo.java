import javax.swing.JOptionPane;
public class ForDemo {
	public static void main(String[] args) {
		int sum=0; // khởi tạo biến sum
		int n; // khai báo biến n để nhập dữ liệu
		String input; //khai báo biến xâu input
		input = JOptionPane.showInputDialog("Cho biet n:"); //chuyển dãy chữ số về số
		n = Integer.parseInt(input);
		//Tính tổng các số chẵn từ 2 đến n
		for (int number = 2; number <=n; number +=2) sum += number;
		//hiển thị kết quả theo hộp thoại DialogBox
		JOptionPane.showMessageDialog(null,"Tong la" +sum, "Tong cac so chan tu 2 den" +n, JOptionPane.INFORMATION_MESSAGE);
//Kết thúc chương trình	
		System.exit(0);
	}

}
