// chương trình mô tả kiểu truyền các tham chếu kiểu mảng
 class Loc {
	 public static void main(String[] args) {
		 int[] day = {8,1,4,3,2,5};
		 // khởi tạo mảng day và gán giá trị đầu
		 // hiển tị các phần tử của dãy trước khi lọc
		 for (int i = 0; i< day.length; i++)
			 System.out.println(" "+day[i]);
		 System.out.println(); //xuống dòng
		 int maxIndex =0;
		 //lọc ra phần tử cực đại và đưa về cuối
		 for (int index = 1; index < day.length; index++){
			 if (day[maxIndex] > day[index]) {
				 doiCho(day,maxIndex,index);
				 maxIndex = index;
			 }
		 } //hiển thị dãy sau khi lọc
		 for (int i = 0; i< day.length;i++)
			 System.out.print(" "+day[i]);
		 System.out.println();
		 
	 }
	 public static void doiCho(int[] bang, int i, int k) {
	 int tg = bang[i]; bang[i] = bang[k]; bang[k] = tg;
 }
}
