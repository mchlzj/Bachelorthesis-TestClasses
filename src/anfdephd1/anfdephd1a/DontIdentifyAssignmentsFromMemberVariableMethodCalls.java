package anfdephd1.anfdephd1a;

import util.DependentClass;

public class DontIdentifyAssignmentsFromMemberVariableMethodCalls {

	DependentClass obj;
	
	public DontIdentifyAssignmentsFromMemberVariableMethodCalls(DependentClass obj) {
		this.obj = obj;
	}
	
	public void noDependency() {
		obj.notify();
	}
}
