package anfdepid1;

import util.DependentClass;

public class IdentifyOnly2InjectableDependencies {

	DependentClass obj;
	
	public IdentifyOnly2InjectableDependencies(DependentClass obj1, DependentClass obj2) {
		this.obj = obj1;
		DependentClass object = obj2;
	}
}
