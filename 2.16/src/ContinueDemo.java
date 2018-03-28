public class ContinueDemo {
	public static void main(String args []) {
		for (int i = 1; i <= 5; ++i ) {
				if (i==4) continue ;
				// phần còn lại sẽ bị bỏ qua
				System.out.println(i+ "\t" +Math.sqrt(i));
				//Thực hiện ++i và kiểm tra để lặp lại
	}
	}

}
