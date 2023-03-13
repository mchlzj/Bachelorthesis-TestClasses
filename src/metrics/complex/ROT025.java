package metrics.complex;

import util.DependentClass;
import util.InjectableClass;
import util.Mockable;
import util.MockableClass;

public class ROT025 {

	Mockable mockable;
	String s;
	
	public ROT025(Mockable mockable, String s) {
		this.mockable = mockable;
		this.s = s;
	}
	
	public void mockableDependency(MockableClass mockableDependency, MockableClass mockableDependency2) {
		MockableClass dependency1 = mockableDependency;
		MockableClass dependency2 = mockableDependency2;
	}
	
	public void injectableDependency(InjectableClass injectable1, InjectableClass injectable2) {
		InjectableClass dependency1 = injectable1;
		InjectableClass dependency2 = injectable2;
	}
	
	public void hardcodedDependency() {
		DependentClass dependency1 = new DependentClass();
		String s1 = "String";
	}
	
	
}
