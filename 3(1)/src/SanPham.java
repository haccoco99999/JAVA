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