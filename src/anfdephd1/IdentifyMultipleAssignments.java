package anfdephd1;

import util.DependentClass;

public class IdentifyMultipleAssignments {

	private DependentClass dependent;
	
	// 4 Dependencies
	private String s;
	
	public IdentifyMultipleAssignments() {
		s = "String1";
		s = "String2";
	}
	
	public void multipleNewKeywords() {
		dependent = new DependentClass();
		dependent = new DependentClass();
	}
	
}
