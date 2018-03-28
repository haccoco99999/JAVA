// ví dụ hàm đệ quy
import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Fibonacci extends JApplet implements ActionListener{
	JLabel numberLabel, resultLabel; 
	JTextField numberField, resultField;
	// thiết lập GUI của applet
	public void init() {
		// nhận về bảng nội dung (content pane) và thiết lập FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		// tạo ra đối tượng numberLabel và đưa vào bảng nội dung
		numberLabel = new JLabel("Nhap vao so nguyen");
		container.add(numberLabel);
		//tạp lập đối tượng numberfield đưa vào bảng nội dung
		numberField = new JTextField(10);
		container.add(numberField);
		// dăng ký applet này như là phần tử lắng nghe sự kiện ActionListener của numberField
		numberField.addActionListener(this);
		//tạo lập đối tượng resultlabel đê đưa vào bảng nội dung
		resultLabel = new JLabel("So Fibonacci tuong ung la");
		container.add(resultLabel);
		//tạp lập đối tượng để hiển thị số resultField và đưa vào bảng nd nhưng k update
		resultField = new JTextField(15);
		resultField.setEditable(false);
		container.add(resultField);
	} // kết thúc hàm init()
	// nhận kết quả nhập vào của ng dùng và gọi àm fibonacci()
	public void actionPerformed(ActionEvent event) {
		long number,fibonacciValue;
		// nhận kq nhập vào của ng dùng và chuyển về long
		number = Long.parseLong(numberField.getText());
		showStatus("Dang tinh...");
		// gọi hàm fibonacci
		fibonacciValue = fibonacci(number);
		// tb ct finish và cho kq
		showStatus("Done.");
		resultField.setText(Long.toString(fibonacciValue));
	}// kết thúc actionPerformed()
	//định nghĩa phương thức đệ quy fibonacci()
	public long fibonacci(long n) {
		// cơ sở đệ quy
		if (n==0 || n==1)
			return n;
		// bước tính đệ quy
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}// kết thúc fibonacci()

} // kết thúc fibonacciTest()
