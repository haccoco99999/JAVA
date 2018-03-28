package goiA;
public class SuperclassA { 
	protected int superclassVarA;//(2)
	protected void superclassMethodA() {/*...*/} //(3)

}
class SubclassA extends SuperclassA{
	void subclassMethodA() {superclassVarA = 20;}//(4)
}
class AnyclassA{
	Superclass obj = new SuperclassA();
	void anyClassMethodA() {
		obj.superclassMethodA(); //(5)
	}
}
