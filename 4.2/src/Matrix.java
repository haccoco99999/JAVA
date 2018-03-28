import java.io.*;
public class Matrix {
	int maTran[][];
	static DataInputStream str = new DataInputStream(System.in);
	// phương thức nhập vào một ma trận có tên name
	public void readMatrix(String name) {
		for (int row =0; row< maTran.length;row++)
			for (int col=0; col <maTran[row].length;col++) {
				try { System.out.print("\t" + name + "[" +row+ "," +col +"]=");
				maTran[row][col] = Integer.parseInt(str.readLine());
				} catch(Exception e) {
					System.out.println("Error:" +e);
				}
			}
	}
	// hiển thị ma trận
	public void displayMatrix() {
		for(int row=0; row< maTran.length;row++) {
			System.out.print("\t\t");
			for (int col=0;col <maTran[row].length; col++) {
				System.out.print(maTran[row][col]+"\t");
			}
			System.out.println();
		}
	
	}
	// nhân hai ma trận vuông m1,m2
	public void multiple(Matrix m1, Matrix m2) {
		for (int i=0; i<m1.maTran.length;i++) 
			for (int j=0; j<m1.maTran[i].length;j++) {
				int t=0;
				for(int k=0; k<m1.maTran[i].length;k++)
					t+= m1.maTran[i][k] * m2.maTran[k][j];
				maTran[i][j] =t;
		}
	}
    // cộng hai ma trận m1,m2 cùng chiều
	public void add(Matrix m1, Matrix m2) {
		for (int i=0; i<m1.maTran.length;i++)
			for (int j=0; j<maTran[i].length;j++) {
				maTran[i][j] = m1.maTran[i][j] + m2.maTran[i][j];
			}
	}
	//trừ 2 ma trận cùng chiều
	public void subst(Matrix m1, Matrix m2) {
		for(int i=0; i<m1.maTran.length;i++)
			for(int j=0; j<m1.maTran[i].length;j++) {
				maTran[i][j] =m1.maTran[i][j] - m2.maTran[i][j];
			}
	}
}
	
