
public class KhoiLong {
	public static void main(String[] args) { // Khối 1
		char c=20; //(1)
		for (int i=0; i<10; i++) { //khối 2
			switch (c) { //khối 3
			case 'a' : int k = 10;
			default: int k = 20; //(2) sai
			}
			if (true) { // khối 4
				int k = 20;
				int c = 30; //(3) sai
				long i = 40;//(4) sai
			}
		}
		for (int i=0; i<10; i++) { //khối 5
			int n=2*i;
		}
	}
	int i=10; //(5)

}
