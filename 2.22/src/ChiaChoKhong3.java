class ChiaCho0Exception extends Exception {
	ChiaCho0Exception(String msg) {super(msg) ;}
}
public class ChiaChoKhong3 {
	public void chia(int n,int m) {  //(1)
		try {
			if (m == 0) throw new ChiaCho0Exception("/ by 0"); //(2)
			System.out.println(n+"/" + m + "=" +(n/m)); //(3)
		}catch (ChiaCho0Exception er) { //(4)
			System.out.println("Gap loi" +er);
		}finally {
			System.out.println("Nhung viec can thuc hien"); } //(5)
		System.out.println("Ket thuc ham chia()"); //(6)
		}
	public static void main(String args []) {
		int n = 20,m = 0;
		new ChiaChoKhong3().chia(n, m);
		System.out.println("Quay lai tu ham main"); //(7)
	}

}
