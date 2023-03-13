package anfdepid1;

import util.DependentClass;

public class IdentifyOnlyInjectableDependency {

	// 1 InjectableDependency
	public IdentifyOnlyInjectableDependency(DependentClass obj) {
		obj.getString();
	}
}
