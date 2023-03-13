package anfdephd1.anfdephd1b;

import util.DependentClass;

public class DontIdentifyNewKeywordInReturnStmt {
	
	// 0 Dependencies
	public DependentClass noDetect() {
		DependentClass dependent = new DependentClass();
		return dependent;
	}
	
	public DependentClass noDetect2() {
		return new DependentClass();
	}
	
	public DependentClass noDetect3() {
		DependentClass dependent;
		dependent = new DependentClass();
		return dependent;
	}
}
