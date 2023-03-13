package anfdephd1;

import util.DependentClass;

public class DontIdentifyMultipleAssignmentsWithNoValue {

	// 1 Dependeny
	public DontIdentifyMultipleAssignmentsWithNoValue() {
		String s;
		s = "Test";
		String s2;
		s2 = s;
	}
	
	// 1 Dependeny
	public void NoValueAssignment2() {
		String s = "Test2";
		String s2 = s;
	}
	
	// 1 Dependeny
	public void NoValueAssignment3() {
		String s = "Test3";
		String s2;
		s2 = s;
	}
	
	// 1 Dependeny
	public void NoValueAssignment4() {
		String s;
		s = "Test4";
		String s2 = s;
	}
}
