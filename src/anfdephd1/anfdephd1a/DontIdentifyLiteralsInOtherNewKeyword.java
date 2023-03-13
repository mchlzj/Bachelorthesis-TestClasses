package anfdephd1.anfdephd1a;

import util.DependentClass;

public class DontIdentifyLiteralsInOtherNewKeyword {
	
	// 1 Dependency
	public DontIdentifyLiteralsInOtherNewKeyword() {
		String s1;
		s1 = "shouldNotBeDetected";
		String s2 = "shouldNotBeDetected";
		
		DependentClass obj = new DependentClass(s1, s2);
	}
}
