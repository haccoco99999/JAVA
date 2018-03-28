public class PhienBH {
	//khai báo mảng ds: danh sách các sản phẩm
	SanPham ds[];
	public void nhapTin() { //nhập vào danh sách ds
		for (int i=0;i < ds.length -1;i++)
			ds[i].hienThi();
	}
	public void sapXep() { //Sắp xếp danh sách theo chiều tăng dần của số lượng
		for (int i = 0; i < ds.length -1; i++)
			for (int j = i + 1; j < ds.length; j++)
				if (ds[j].soLuong < ds[i].soLuong) {
					int  t = ds[j].soLuong;
					SanPham.soLuong = ds[i].soLuong;
					SanPham.soLuong = t;
				}
	}
	public static void main(String[] args) {
		// khai báo biến tham chiếu và khởi tạo đối tượng mặc định lớp PhienBH
		PhienBH phienB = new PhienBH();
		System.out.print("----Cho biet so luong san pham ban duoc n=");
		//Nhập vào số lượng hàng đã bán
		int n = MyInput.readInt();
		//Tạo lập mảng n sản phẩm của ds của phienB
		phienB.ds= new SanPham[n];
		//Tạo lập đối tượng là các sản phẩm của mảng ds của phienB
		
		System.out.print("---Nhap cac san pham da ban duoc");
		phienB.nhapTin();
		System.out.println("---Cac san pham da bn duoc truoc khi sap xep--");
		phienB.hienThi();
		System.out.println("---sap xep theo thu tu giam dan---");
		phienB.sapXep();
		System.out.println("---Cac san pham da nam duoc sau khi sap xep--");
		phienB.hienThi();
		float sum=0;
		for (int i = 0; i < phienB.ds.length;i++);
		int i;
		sum +=phienB.ds[i].tinhTien();
		System.out.println("\t Tong so tien ban duoc:" +sum);
	}
	private void hienThi() {
		
		
	}

}
