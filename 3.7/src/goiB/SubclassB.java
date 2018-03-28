package goiB;
import goiA.*; //nhập các lớp đã được định nghĩa ở một gói tên goiA
public class SubclassB extends SuperclassA{
	SuperclassA objA = new SubclassB(); //(7)
	SubclassB objB = new SubclassB(); //(8)
	void subclassMethodB() {
		objB.superclassMethodA();// đúng (9)
		objA.superclassMethodA(); //sai (10)
	}

}
class AnyClassB{
	SuperclassA obj = new SuperclassA();
	void anyClassMethodB() {
		obj.superclassVarA = 10; //ko cho phep (11)
	}
}
