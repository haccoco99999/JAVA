 public class HinhCN {
	 float dai,rong;
	 float dienTich() {
		 return dai*rong;
	 }
	 public HinhCN(float d,float r) {
		 dai=d;
		 rong=r;
	 }
	 public static void main(String[] args) {
		 HinhCN h= new HinhCN(12,45.5F);
		 System.out.println("Dien tich cua hinh chu nhat h la:" +h.dienTich());
	 }

}
