// sử dụng bộ finalizer để dọn dẹp bộ nhớ
class Dien{
	static int dem;
	static int congChung;
	protected int lan;
	public Dien() {
		lan = dem++;
		++congChung;
	}
	protected void finalize() throws Throwable{
		super.finalize();
		--congChung;
	}
}
class TrinhDien extends Dien{
	int[] fat;
	public TrinhDien(int n) {
		fat = new int[n];
		System.out.println(lan+":Hello");
	}
	protected void finalize() throws Throwable{
		System.out.println(lan+":Bye");
		super.finalize();
	}
}
public class Finalizer {
	public static void main(String[] args) {
		int soLan=5 , thoiGian = 500000;
		for(int i = 0; i< soLan;i++) {
			new TrinhDien(thoiGian);
		}
		System.out.println(Dien.congChung+":tieptuc");
	}

}
