// xây dựng lớp Time , hour, second, minute được che giấu
import java.text.DecimalFormat;
public class Time extends Object {
	private int hour; //0-23
	private int minute; //0-59
	private int second; //0-59
	// phương thức tạo lập Time thiết lập các thuộc tính bằng 0
	public Time() {
		setTime(0,0,0); //gọi gàm setTime() để thiết lập thời gian
	} 
	//nạp chông các phương thức tạo lập Tie
	public Time(int h) {
		setTime(h,0,0); // gọi hàm setTime() để thiết lập thời goam cs h
	}
	public Time(int h, int m) {
		setTime(h,m,0);
	}
	public Time(int h, int m, int s) {
		setTime(h,m,s);}
		public Time(Time time) {
			setTime(time.getHour(),time.getMinute(), time.getSecond());
		
	}
		public void setTime(int h, int m, int s) {
			hour = ((h>=0 && h<24)? h:0);
			minute = ((m>=0 && m<60)? m:0);
			second = ((s>=0 && s<60)? s:0);
		}
		public void setHour(int h) {
			hour = ((h>=0 && h<24)? h:0); 
		}
		public int getHour() {
			return hour;
		}
		public void setMinute(int m) {
			minute = ((m>=0 && m<60)? m:0);
		}
		public int getMinute() {
			return minute;
		}
		public void setSecond(int s) {
			second = ((s>=0 && s<60)? s:0);
		}
		public int getSecond() {
			return second;
		}
		// chuyển kết thời gian ở dạng chuỗi ký tự sang dạng universal - time
		public String toUniversalString() {
			DecimalFormat twoDigits = new DecimalFormat("00");
			return twoDigits.format(hour)+":"+ twoDigits.format(minute) +":"+ twoDigits.format(second);
		}
		// chuyển kết thời gian ở dạng chuỗi ký tự sang dạng standard - time
		public String toStandardString () {
			DecimalFormat twoDigits = new DecimalFormat("00");
			return((hour == 12 || hour == 0)? 12:hour %12) + ":" + twoDigits.format(second) + (hour<12? "AM":"PM");
		}
		

}
