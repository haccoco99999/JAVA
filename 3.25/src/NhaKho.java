class BongDen{
	private int soWatts;
	private boolean batTat;
	private String viTri;
	//định nghĩa phương thức tạo lập số 1
	BongDen(){
		this(40,true);
		System.out.println("Phương thức số 1");
	}
	//định nghĩa phương thức tạo lập k mặc định số 2
	BongDen(int w, boolean s){
		this(w,s,"XX");
		System.out.println("Phương thức số 2");
	}
	// soos 3
	BongDen(int soWatts, boolean batTat, String viTri){
		this.soWatts = soWatts;
		this.batTat=batTat;
		this.viTri = new String(viTri);
		System.out.println("Phương thức số 3");
	}
}
class DenTuyp extends BongDen{
	private int doDai;
	private int mau;
	DenTuyp(int leng, int colo){
		this(leng,colo,100,true,"Chua biet");
	}
	DenTuyp(int leng, int colo, int soWatt, boolean bt, String noi){
		super(soWatt,bt,noi);
		this.doDai = leng;
	}
}

public class NhaKho {
	public static void main(String[] args) {
		DenTuyp d = new DenTuyp(20,5);
		System.out.println("Tao ra bong den tuyp");
	}

}
