package demo;

import util.DependentClass;

public class DepHD1B {

	public DependentClass createObj() {
		String s1 = "Dependency";
		String s2 = "Dependency2";
		DependentClass obj = new DependentClass(s1, s2);
		return obj;
	}
}
