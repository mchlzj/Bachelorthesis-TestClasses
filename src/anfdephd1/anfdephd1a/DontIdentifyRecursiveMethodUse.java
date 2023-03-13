package anfdephd1.anfdephd1a;

import util.DependentClass;

public class DontIdentifyRecursiveMethodUse {

	public DontIdentifyRecursiveMethodUse() {
		DependentClass obj = new DependentClass();
		obj.setString(getString("String"));
		
	}
	
	String getString(String s) {
		return s;
	}
}
