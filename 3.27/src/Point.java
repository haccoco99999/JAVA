
public class Point {
	protected int x;
	protected int y;
	public Point() {
		// mặc định tạo lập x=y=0 từ phương thức tạo lập của Object
	}
	// nạp chông phương thức tạp lập có tham số
	public Point (int xValue, int yValue) {
		x=xValue;
		y=yValue;
	}
	// đặt lại tọa độ x
	public void setX(int xValue) {
		x=xValue;
	}
	// lấy ra tọ độ x
	public int getX() {
		return x;
	}
	// lấy ra tọa độ y
	public void setY(int yValue) {
		y=yValue;
	}
	//đọc lại giá trị tọa độ y
	public int getY() {
		return y;
	}
	// chuyển tọa độ (x,y) sang dạng String
	public String toString() {
		return "["+x+","+y+"]";
	}

} // kết thúc Point
