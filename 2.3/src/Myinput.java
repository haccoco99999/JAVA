package input;
import java.io.*;
public class Myinput {
	static private DataInputStream input = new DataInputStream(System.in);
	public static byte readByte() {
		byte b;
		try {
			String line =input.readLine();
			b = Byte.parseByte(line);
			return b;
		}catch (IOException ex) {
			System.out.println("Loi vao/ra" + ex);
			return Byte.MAX_VALUE;
		}
	}
public static short readShort () {
	short s;
	try {
		String line = input.readLine();
		s = Short.parseShort(Line);
		return s;
	}catch (IOException ex) {
		System.out.println("Loi vao/ra"+ ex);
		return Short.MAX_VALUE;
	}
}
public static int readInt () {
	int i;
	try {
		String line = input.readLine();
		i = Integer.parseInt(line);
		return i;
	}catch (IOException ex) {
		System.out.println("Loi vao/ra" + ex);
		return Integer.MAX_VALUE;
	}
}
public static long readLong () {
	long l;
	try {
		String line = input.readLine();
		l = Long.parseLong(line);
		return l;
	}catch (IOexception ex) {
		System.out.println("Loi vao/ra" + ex);
		return Long.MAX_VALUE;
	}
}
public static float readFloat() {
	float f;
	try {
		String line = input.readLine();
		f = Float.parseFloat(line);
		return f;
}catch (IOException ex) {
	System.out.println("Loi vao/ra"+ ex);
	return Float.MAX_VALUE;
}
}
public static double readDouble () {
	double d;
	try {
		String line = input.readLine();
		d = Double.parseDouble(line);
		return d;	
	}catch (IOException ex) {
		System.out.println("Loi vao/ra" + ex);
		return Double.MAX_VALUE;
		
	}
}
public static char readChar () {
	try {
		String line = input.readLine();
		return line.charAt(0);
	}catch (IOException ex) {
		System.out.println("Loi vao/ra" + ex);
		return '$';
	}
}
public static String readString() {
	try {String line = input.readLine ();
	return line;
	}catch (IOException ex) {
		System.out.println("Loi vao/ra" + ex);
		return null;
	}
}
}
