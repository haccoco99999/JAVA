package goiB;
import goiA.*; //nhập các lớp đã định nghĩa ở gói
public class subclassB extends SuperclassA{
	void subclassMethodB() {superclassMethodA();}//(7)
}
class AnyclassB{
	SuperclassA obj= new SuperclassA();
	void anyClassMethodB() {
		obj.superclassVarA = 10;
	}
}
