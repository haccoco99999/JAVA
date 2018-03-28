public class returndemo {
	public static void main(String args []) {
		if (args.length == 0) return; //Nếu ko có đối số thì kết thúc
		int val = check(args.length); //kiểm tra xem số đối số > 3 hay mặc định là 2
		output(val); //Hiển thị số đối số
	}
	static void output (int val) {
		System.out.println(val);
		return 1; //Không được phép vì output kiểu void
	}
	static int check(int i) {
		if (i > 3) return i;
		else return 2;
	}

}
                                   