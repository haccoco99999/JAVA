class ChiaCho0Exception extends Exception {
	ChiaCho0Exception(String msg) {super(msg);}
}
public class ChiaChoKhong4 {
	public void chia() throws ChiaCho0Exception {
		int n1 = 20;
		int n2 = 0;
		if(n2 == 0) throw new ChiaCho0Exception("/ by 0");
		System.out.println(n1+ "/" +n2+"=" +(n1/n2));
		System.out.println("Ket thuc ham chia()");
	}
	public static void main(String args []) {
		try {
			new ChiaChoKhong4().chia();
		}catch (ChiaCho0Exception er) {
			System.out.println("Trong main() gap loi:" +er);
		}finally {
			System.out.println("Nhung viec can thuc hien");
		}
		System.out.println("Quay lai tu ham main");
	}

}
