package metrics.complex;

import util.InjectableClass;
import util.MockableClass;

public class ROM033 {

	MockableClass mockable;
	
	public ROM033(MockableClass mockable) {
		this.mockable = mockable;
	}
	
	public void someInjectableDependencies(InjectableClass injectable) {
		InjectableClass injectable2 = injectable;
	}
	
	public void someHardcodedDependencies() {
		String s1 = "String1";
	}
}
