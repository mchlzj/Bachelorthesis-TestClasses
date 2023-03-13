package anfdephd2;

import util.DependentClass;

public class IdentifyGlobalCallsFromClazz {

	// 2 Dependencies
	public IdentifyGlobalCallsFromClazz() {
		DependentClass.class.isAssignableFrom(getClass());
		DependentClass.class.isAnnotation();
	}
}
