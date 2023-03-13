package anfdephd1.anfdephd1a;

import util.DependentClass;

public class DontIdentifyValuesInOtherConstructor {

	// 2 Dependencies
	public DontIdentifyValuesInOtherConstructor() {
		DependentClass dependent = new DependentClass("Test","Test2");
		String s = "Test3";
	}
}
