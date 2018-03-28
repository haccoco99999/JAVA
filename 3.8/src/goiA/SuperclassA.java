package goiA;
public class SuperclassA {
	int superclassVarA;
	void superclassMethodA() {/*...*/}

}
class SubclassA extends SuperclassA{
	void subclassMethodA() {superclassVarA = 20;}
}
class AnyClassA{
	SuperclassA obj = new SuperclassA();
	void anyClassMethodA() {
		obj.superclassMethodA();
	}
}
