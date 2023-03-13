package anfdephd2;

import util.DependentClass;

public class IdentifyGlobalValueCallsOrAssignments {

	public IdentifyGlobalValueCallsOrAssignments() {
		String s1 = DependentClass.getGlobalDependency();
	}
	
	public  void GlobalDependencyChange() {
		DependentClass.changeGlobalDependency("AnotherValue");
	}
	
	public  void GlobalDependencyFromField() {
		String s1 = DependentClass.globalDependencyField;
	}
	
	public  void GlobalDependencyChangeFromField() {
		DependentClass.globalDependencyField =  "AnotherValue";
	}
	
	private String getValue() {
		return "ArnotherValue";
	}
}
