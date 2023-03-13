package metrics.complex;

import util.DependentClass;
import util.InjectableClass;

public class ROI033 {

	InjectableClass injectable;
	
	public ROI033(InjectableClass injectable) {
		this.injectable = injectable;
	}
	
	public void someHardcodedDependencies() {
		String s1 = "String";
		DependentClass dependent = new DependentClass();
	}
}
