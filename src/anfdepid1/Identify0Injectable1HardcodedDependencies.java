package anfdepid1;

import util.DependentClass;

public class Identify0Injectable1HardcodedDependencies {

	public Identify0Injectable1HardcodedDependencies(String s, String s2) {
		
	}
	
	public void MethodParameters2(String s1, String s2) {
		String shouldNotBeDetected;
		shouldNotBeDetected = "String";
		String shouldAlsoNotBeDetected = "Test";
		
		DependentClass obj;
		
		obj = new DependentClass(shouldNotBeDetected,shouldAlsoNotBeDetected);
	}
}
