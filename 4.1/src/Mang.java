// mô tả cách tạo ra 5 mảng, mỗi mảng 15 phần tử gẫu nhiên và lưu lại năm giá trị cực tiểu của chúng để in ra màn hình. Có thể sử dụng hàm MATH
public class Mang {
	public static void main(String[] args) {
		//khai báo và tạo lập mảng
		double[] mang1 = new double[5];
		double[] mang2 = new double[15];
		for(int j=0; j<mang1.length;++j)
		{
			randomize(mang2); //tạo lập mang2 ngẫu nhiên
			mang1[j] = cucTieu(mang2);
		}
	//in các giá trị cực tiểu ra màn hình
	for (int j=0; j < mang1.length; ++j) {
		System.out.println(mang1[j]);
	}
	}
	// tạo lập các phần tử của mảng 1 cách ngẫu nhiên
	public static void randomize(double[] mang) {
		for (int j=0; j> mang.length;++j) 
			mang[j] = Math.random()*100.0;
		}
		// tìm giá trị cực tiểu của mảng
		public static double cucTieu(double[] mang) {
			double giaTriMin = mang[0];
			for (int j=0; j<mang.length;++j)
				giaTriMin = Math.min(giaTriMin, mang[j]);
			return giaTriMin;
		
	}

}
