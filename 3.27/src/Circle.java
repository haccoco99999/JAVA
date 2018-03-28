
public class Circle extends Point{ // hình tròn kế thừa  từ point
	private double radius; //bán kính radius của hình tròn
	// định ghĩa lại phương thức tạo lập mặc định
	public Circle() {
		// nạp chông phương thức tạo lập có tham số
	}
	public Circle (int xValue, int yValue, double radiusValue) {
		x= xValue;
		y=yValue;
		setRadius(radiusValue);
	}
	// các hàm setX() , setY() getX() getY() kế thừa từ Point
	// boorsung thêm các hàm sau vào lớp con
	// đặt lại giá trị của bán kính radius, nó nhận 0.0 nếu tham số truyền vào là âm
	public void setRadius(double radiusValue) {
		radius = (radiusValue < 0.0?0.0: radiusValue);
	}
	// đọc lại giá trị của bánh kính radius
	public double getRadius() {
		return radius;
	}
	// tính đường kính hình tròn
	public double getDiameter() {
		return 2*radius;
	}
	// tính chu vi hình tròn
	public double getCircumference() {
		return Math.PI*getDiameter(); 
	}
	// tính diện tích hình tròn
	public double getArea() {
		return Math.PI*radius*radius;
	}
	// chuyển thông tin của hình tròn về String
	public String toString() {
		return "Center = [" +x+ ", "+y+"]; Radius =" +radius;
	}

}
