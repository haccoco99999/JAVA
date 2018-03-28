
public class MatrixTest {
	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.maTran = new int[2][2];
		System.out.println("\t----Nhap ma tran A:");
		m1.readMatrix("A");
		Matrix m2 = new Matrix();
		m2.maTran = new int[2][2];
		System.out.println("\t----Nhap ma tran B:");
		m2.readMatrix("B");
		Matrix m =new Matrix();
		m.maTran = new int[2][2];
		m.multiple(m1,m2);
		System.out.println("\tA*B =");
		m.displayMatrix();
		System.out.println("\tA-B =");
		m.subst(m1, m2);
		m.displayMatrix();
	}

}
