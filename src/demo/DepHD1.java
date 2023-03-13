package demo;

import util.DependentClass;
import util.DependentClassFactory;

public class DepHD1 {

	DependentClass hardcodedDependency;
	
	public DepHD1() {
		this.hardcodedDependency = new DependentClass();
	}
	public void anotherHardcodedDependency() {
		neueSchnittstelle(new DependentClass());
	}
	public void neueSchnittstelle(DependentClass injectableDependency) {
		this.hardcodedDependency = injectableDependency;
	}
}



