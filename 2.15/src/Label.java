public class Label {
	public static void main(String args []) {
		int [] [] MaTran = { {4,3,5} , {2,1,6}, {9,7,8}};
		int sum = 0;
		outer: // gắn nhãn outer cho khối
			for (int i = 0; i < 3; i++) { //(1)
				for (int j =0; j < 3; i++) { //(2)
					if (i==j) break; //kết thúc chu trình (2) và tiếp ở (1)
					System.out.println("Bang ["+i+","+j+"] = " +MaTran[i] [j]);
					sum +=MaTran[i][j];
					if (sum >10) break outer; //kết thúc khối outer (cả hai chu trình for) và chuyển tới (3)
				} //kết thúc for bên trong
			} //kết thúc for bên ngoài
		System.out.println("Tong sum = " + sum);
	}
 
}
