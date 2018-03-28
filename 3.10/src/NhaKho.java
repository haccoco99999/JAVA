class BongDen{
	// Biến thành phần final static
	final static double KWH_GIA  = 200.00; //giá bán điện 500đ/kwh
	int soWatts;
	// hàm thành phần final
	final public void datWatt(int watt) {
		soWatts = watt;
	}
	public void datLaiGia() {
		KWH_GIA = 400.00; //sai vì ko cho phép thay đổi lại biến final static
	}
}
class DenTuyp extends BongDen{
	//K thể nạp chồng lại hàm của BongDen
	public void datWatt (int w) {
		//thử viết đè hàm final do v chương trình dịch k thực hiện.sai
		soWatts = 2*w;
	}
}
public class NhaKho {
	public static void main(String[] args) {
		final BongDen den = new BongDen();
		den.soWatts = 100;
		// đc phép thay đổi thuộc tính của đối tượng
		den = new BongDen();
		//sai vì k cho phép thay đổi đối tượng
	}

}
