package demo;

import util.DependentClass;
import util.PlaceholderClass;

public class DepHD1A {
	
	public DepHD1A() {
		PlaceholderClass class1 = new PlaceholderClass();
		PlaceholderClass class2 = new PlaceholderClass();
		DependentClass hardcodedDependency = new DependentClass(class1, class2);
	}
}
