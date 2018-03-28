class BongDen { //các biến thành phần lớp được che giấu
	protected int soWatts; //số watts của bóng đèn
	private boolean batTat = false; //true - bóng sáng false bóng tắt
	public String viTri; // nơi đặt bóng đèn
	// các hàm thành phần
	public void batDen() {batTat = true;}//bật đèn
	public void tatDen() {batTat = false;}//tắt đèn
	public boolean tatHaySang() {return batTat;}
	// tạo ra bóng đèn mới bằng ách nhân đôi or copy
	public BongDen nhanDoi(BongDen bongCu) {
		BongDen bongMoi = new BongDen();
		bongMoi.soWatts = bongCu.soWatts;
		bongMoi.batTat = bongCu.batTat;
		bongMoi.viTri= new String(bongCu.viTri);
		return bongMoi;
	}

}
