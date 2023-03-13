package anfdephd1.anfdephd1d;

import util.DependentClass;

public class DontIdentifyParentMethodUse extends DependentClass{

	// 0 Dependencies
	String s;
	
	public void withSuper() {
		super.getString();
	}
	
	public void withoutSuper() {
		getString();
	}
	
	public void withSuperAssignment() {
		s = super.getString();
	}
	
	public void withoutSuperAssignment() {
		s = getString();
	}
}

