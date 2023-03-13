package anfdephd1.anfdephd1b;

import util.DependentClass;

public class DontIdentifyPtimitivesOrObjectsInReturnStmt {

	// 0 Dependencies
	
	public int getInt() {
		int i = 1;
		return i;
	}
	
	public int getInt2() {
		return 1;
	}
	
	public DependentClass getDependent() {
		DependentClass dependent = new DependentClass();
		return dependent;
	}
	
	public DependentClass getDependent2() {
		return new DependentClass();
	}
}
