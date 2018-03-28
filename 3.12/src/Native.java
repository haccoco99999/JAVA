// ví dụ hoạt động của native
public class Native {
	/* khối static này đảm bảo thư viện các hàm native được nạp xuống trước khi chúng được gọi*/
	static{
		System.loadLibrary("nativeMethodLib"); // nạp thư viện native
	}
	native void nativeMethod(); //Hàm prototype native
	// các câu lệnh cần thực hiện
	class Khach{
		public static void main(String[] args) {
			native aNative = new Native();
			aNative.nativeMethod();
		}
	}

}
