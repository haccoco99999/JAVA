package goiB;
import goiA.*;
public class SuperclassB extends SuperclassA {
	SuperclassA objA = new SubclassB();
	SubclassB objB = new SuperclassB();
	void subclassMethodB() {
		objB.superclassMethodA(); //ko cho phep
		objA.superclassMethodA(); // ko cho phep
	}

}
class AnyClassB {
	SuperclassA obj = new SuperclassA();
	void anyClassMethodB() {
		obj.superclassVarA = 10; //ko cho phep
	}
}
