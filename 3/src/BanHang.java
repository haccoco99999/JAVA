import java.util.Scanner;
public class SanPham {
	public String tenSP;
	int soLuong;
	float giaBan;
	public void nhapTin() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\t Ten san pham: ");
		tenSP = scan.nextLine();
		System.out.print("\t So luong:");
		soLuong = scan.nextInt();
		System.out.print("\t Gia ban: ");
		giaBan = scan.nextFloat();
	}
	public void hienThi() {
		System.out.prinf("\t% -15s| %10d| %12.2f", tenSP,soLuong,giaBan,tinhTien());
		System.out.println();
	}
	public float tinhTien() {
		return soLuong * giaBan;
	}
}
public class BanHang{
	SanPham ds[];
	public void nhapTin() {
		for(int k = 0; k < ds.length;k++) {
			System.out.println("\t---- San pham thu" + (k + 1));
			ds[k] = new SanPham();
			ds[k].nhapTin();
		}
	}
	public void hienThi() {
		for(int k = 0; k< ds.length; k++) {
			ds[k].hienThi();
		}
	}
	public static void main(String args[]) {
		BanHang banHang = new BanHang();
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("\tSo san pham n =");
		n = scan.nextInt();
		banHang.ds = new SanPham[n];
		banHang.nhapTin();
		System.out.println();
		System.out.printf("\t%12s %10s %14s %14s", "Ten san pham", "So Luong", "Gia ban", "Thanh tien");
		System.out.println("\n");
		banHang.hienThi();
	}
}
