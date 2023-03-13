package anfdephd1;

import util.DependentClass;

public class IdentifyAssignments {

	// 2 Dependencies
	String s;
	DependentClass dependen;
	public void literalAssignment() {
		s = "Test";
	}
	
	public void dependentAssignment() {
		dependen = new DependentClass();
	}
}
