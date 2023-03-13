package metrics;

import util.DependentClass;
import util.InjectableClass;
import util.Mockable;
import util.MockableClass;

public class AllCategories {
	
	public AllCategories(InjectableClass injectable,MockableClass mockable, Mockable noDependency) {
		InjectableClass injectableObj = injectable;
		MockableClass mockableObj= mockable;
		DependentClass dependent = new DependentClass();
		Mockable noDependencyObj = noDependency;
	}
}
