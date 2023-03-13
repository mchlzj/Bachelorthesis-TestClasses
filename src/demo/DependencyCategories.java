package demo;

import util.DependentClass;
import util.InjectableClass;
import util.Mockable;
import util.MockableClass;

public class DependencyCategories {

	InjectableClass injectableObj;
	MockableClass mockableObj;
	Mockable noDependencyObj;
	
	public void hardcodedDependency() {
		DependentClass dependentObj = new DependentClass();
	}
	public void injectableDependency(InjectableClass injectableObj) {
		this.injectableObj = injectableObj;
	}
	public void mockableDependency(MockableClass mockableObj) {
		this.mockableObj = mockableObj;
	}
	public void noDependency(Mockable noDependencyObj) {
		this.noDependencyObj = noDependencyObj;
	}
}



