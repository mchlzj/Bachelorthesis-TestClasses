package anfdepid1;

import util.DependentClass;

public class IdentifyAssignmentFromInjectableDependencyMethodCall {

	// 1 InjectableDependency
	DependentClass obj;
	String s2;
	
	public IdentifyAssignmentFromInjectableDependencyMethodCall(DependentClass obj) {
		this.obj = obj;

	}
	public void neDependency() {
		String s = obj.getString();
		this.s2 = obj.getString();
		s2 = obj.getString();
		String s3 = this.obj.getString();
		this.s2 = this.obj.getString();
		s2 = this.obj.getString();
	}
	
	public void alsoNoDependencies(DependentClass obj2) {
		String s = obj2.getString();
		this.s2 = obj2.getString();
		s2 = obj2.getString();
	}
	
}
