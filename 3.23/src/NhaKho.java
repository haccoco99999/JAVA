class BongDen{
	// biến thành phần
	private int soWatts;
	private boolean batTat;
	private String viTri;
	// định nghĩa phương thứ tạo lập mặc định số 1
	BongDen(){
		soWatts =40;
		batTat = true;
		viTri = new String("XX");
		System.out.println("Phương thức số 1");
	}
	// định nghĩa phương thức tạo  lập k mặc định số 2  
	BongDen(int w.boolean s){
		soWatts = w;
		batTat = s;
		viTri = newString("XX");
		System.out.println("Phương thức số 2");
	}
	// định nghĩa phương thức tạo lập k mặc định số 3 nạp chồng
	BongDen(int soWatts, boolean batTat, String viTri){
		this.soWatts = soWatts;
		this.batTat = batTat;
		this.viTri = new String(viTri);
		System.out.println("PHương thức số 3");
	}
	// các lệnh cân  thưc hiện
			
	
}
public class NhaKho {
	public static void main(String[] args) {
		BongDen d1 = new BongDen();
		BongDen d2 = new BongDen(100, true, "Nha bep");
		BongDen d3 = new BongDen(100. true);
	}

}
