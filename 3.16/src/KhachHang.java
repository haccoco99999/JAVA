//minh họa kiểu truyền theo giá trị tham chiếu đối tượng
public class KhachHang {
	public static void main(String[] args) {
		Banh banhMoi = new Banh(); //tạo ra 1 đối tượng
		System.out.println("Nhoi thit vao banh nuong:" +banhMoi.thit );
		nuong(banhMoi);
		System.out.println("Thit cua banh sau khi nuong:" +banhMoi.thit);
	}
	public static void nuong(Banh banhNuong) {
		banhNuong.thit = "Thit vit"; //người nướng bánh đổi nhân thành thịt vịt
		banhNuong = null;
	}
	class Banh{ 
		String thit= "Thit ga";
	}

}
