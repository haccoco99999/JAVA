abstract class BongDen{
	// biến thành phần
	int soWatts;
	boolean batTat;
	String viTri;
	// hàm thành phần
	public void batSang() {batTat = true;}
	public void tat() {batTat = false;}
	public boolean sangTat() {return batTat;}
	//hàm abstrac
	abstract public double xacDinhGia(); //chưa có nội dung
}
class DenTuyp extends BongDen{ //biến thành phần
	int doDai;
	int mau;
	// cài đặt hàm abstract xacDinhGia
	public double xacDinhGia() {
		return 500.00;
	}
}
public class NhaKho {
	public static void main(String[] args) {
		DenTuyp den1 = new DenTuyp();
		System.out.println("Gia dien:)" +den1.xacDinhGia());
		BongDen den2; // khai báo kiểu abstraact
		Bonđen den3 = new BongDen(); // sai vì lớp abstract k có thể hiện
	}

}
