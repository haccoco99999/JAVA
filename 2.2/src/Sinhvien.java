import input.MyInput;
import java.io.*;
public class Sinhvien {
	public String hoTen;
	public String diachi;
	public String Monhoc;
	private static float diemMH;
	static int siSO;
	public Sinhvien() {
}
	public Sinhvien(String hTen, String dChi,String mHoc,float dMH)
	{
		hoTen = hTen;
		diachi = dChi;
		Monhoc = mHoc;
		diemMH = dMH;
		siSO++;
	}
	public void nhapTin() {
		System.out.print("\tHo ten sinh vien:");
		hoTen = input.MyInput.readString();
		System.out.println("\tDia chi   :");
		diachi = input.MyInput.readString();
		System.out.print("\tMon hoc     :");
		Monhoc = input.MyInput.readString();
		System.out.print("\tDiem mon hoc   :");
		diemMH = input.MyInput.readFloat ();
	}
	
	public void hienThi () {
		System.out.println("\tHo ten sinh vien:" + hoTen);
		System.out.println("\tDia chi:        " + diachi);
		System.out.println("\tMon hoc:        " + Monhoc);
		System.out.println("\tDiem mon hoc:   " + diemMH);
	}
	public void setDiem(float d) {
		diemMH = d;
	}
	public float getDiem () {
		return diemMH;
	}
	public static void main(String [] args) {
		Sinhvien sv = new Sinhvien();
		System.out.println(" ---Nhap thong tin cua sinh vien ---\n");
		sv.nhapTin();
		System.out.println(" ---Thong tin sinh vien da nhap ---\n");
		sv.hienThi ();
	}
}