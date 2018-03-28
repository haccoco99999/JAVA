import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class ShapeTest {
	public static void main(String[] args) {
		// khởi tạo đối tượng hình tròn
		Circle circle = new Circle( 37,43,2.5);
		String output = "---Thong tin ve hinh tron----\n";
		// đưa thông tin về hình tròn vào output
		output += circle.toString();
		// tạo ra mẫu forrmat để in số có 2 chữ số thập phân có dajg "0.00"
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		// đưa đường kính vào output
		output += "\nDuong kinh"+ twoDigits.format(circle.getArea());
		// tạo lập đối tượng hình trụ
		Cylinder cylinder = new Cylinder(37,43,2.5,10.5);
		// đưa thông tin hình trụ vào output
		output +="\n\t-----Thong tin ve hinh tru----\nToa dõ:"+cylinder.getX() + "\nToa do Y:" + cylinder.getY() + "\nBan kinh la:" + cylinder.getRadius() + "\nChieu cao:"
+cylinder.getHight();	
	// đưa đường kính vào output
	output += "\nDuong kinh" + twoDigits.format(cylinder.getDiameter());
	// đưa chu vi vào output
	output += "\nChu vi: " +twoDigits.format(cylinder.getCircumference());
	// đưa thể tích vào output
	output += "\nThe tich:" + twoDigits.format(cylinder.getVolume());
	// hiển thị output trên hộp thoại
	JOptionPane.showMessageDialog(null, output);
	System.exit(0);
	}

}
