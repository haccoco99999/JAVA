import javax.swing.*;
public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time(); //00:00:00
		Time t2 = new Time(2); //02:00:00
		Time t3 = new Time(21,34); //21:34:00
		Time t4 = new Time(12,25,42); //12:25:42
		Time t5 = new Time(27,74,99);//00:00:00
		Time t6 = new Time(t4); //12:25:42
		String output = "--Tao lap cac doi tuong cua Time: "+"\nt1: tat ca tham so mac dinh" +"\n " +t1.toUniversalString() + "\n "+t1.toStandardString();
		output +="\nt2: hour xac dinh;minute va second mac dinh" + "\n  " +t2.toUniversalString() + "\n  " +t2.toStandardString();
		output +="\nt3: hour xac dinh;minute va second mac dinh" + "\n  " +t3.toUniversalString() + "\n  " +t3.toStandardString();
		output +="\nt4: hour xac dinh;minute va second mac dinh" + "\n  " +t4.toUniversalString() + "\n  " +t4.toStandardString();
		output +="\nt5: hour xac dinh;minute va second mac dinh" + "\n  " +t5.toUniversalString() + "\n  " +t5.toStandardString();
		output +="\nt6: hour xac dinh;minute va second mac dinh" + "\n  " +t6.toUniversalString() + "\n  " +t6.toStandardString();
		JOptionPane.showMessageDialog(null,output,"Overload Constructors", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}