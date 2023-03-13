package demo;

import util.InjectableClass;

public class DepID1 {

	String s1;
	
	public DepID1(InjectableClass injectableDependency) {
		s1 = injectableDependency.getValue();
	}
}


