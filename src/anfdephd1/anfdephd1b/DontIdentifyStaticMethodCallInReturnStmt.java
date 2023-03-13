package anfdephd1.anfdephd1b;

import util.DependentClass;

public class DontIdentifyStaticMethodCallInReturnStmt {

	// 0 Dependencies
	public String staticMethodInReturnStmt() {
		return DependentClass.getGlobalDependency();
	}
}
