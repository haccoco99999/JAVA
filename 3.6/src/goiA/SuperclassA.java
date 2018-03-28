package goiA; // định nghĩa gói có tên gói A
public class SuperclassA { // lớp cha
	public int superclassVarA;//(2)
	public void superclassMethodA() {/*...*/}//(3)
	}
class SubclassA extends SuperclassA{ // định nghĩa lớp con
	void subclassMethodA() {superclassVarA = 20;} //(4)
}
class AnyClassA{ //định nghĩa lớp bất kì
	SuperclassA obj = new SuperclassA();
	void anyClassMethodA() {
		obj.superclassMethodA();
	}
}

