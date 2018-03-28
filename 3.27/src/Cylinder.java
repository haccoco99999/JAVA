
public class Cylinder extends Circle{ // lớp hinhd trụ kế thừa lớp circle
	private double hight; // chiều cao hight
	// định nghĩa lại phương thức tạp lập mặc định
	public Cylinder() {	
	}
	// nạp chông phương thức tạo lập đủ tham số
	public Cylinder (int xValue, int yValue, double radiusValue, double h) {
		// sử dụng phương thức tạo lập từ lớp cha
		super(xValue, yValue, radiusValue);
		setHight(h); //đặt lại chiều cao hight
	}
	// đặt lại chiều cao
	public void setHight (double hightValue) {
		hight = (hightValue < 0.0?0.0: hightValue);
	}
	// đọc chiều cao hight
	public double getHight() {
		return hight;
	}
	// viết đè hèm getCircumference() để tính chu vi hình trụ
	public double getCircumference() {
		return Math.PI * getDiameter() * hight;
	}
	// bổ sung hàm getVolume() để tính thể tích hình trụ
	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * hight;
	}
	// viết đè hàm toString () để chuyển thông tin hình trụ về String
	public String toString() {
		return "Center = ["+x+","+y+"]; Radius = "+getRadius() + "hight" + hight;
	}

}
