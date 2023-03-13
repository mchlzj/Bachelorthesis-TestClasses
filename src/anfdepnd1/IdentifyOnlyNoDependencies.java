package anfdepnd1;

import java.util.List;

import util.Mockable;
import util.MockableClass;

public class IdentifyOnlyNoDependencies {
	String s;
	int i;
	int[] arrInt;
	List<Mockable> noDependencyList;
	
	// 3 No Dependency
	public IdentifyOnlyNoDependencies(String s, int i, int[] arrInt, List<Mockable> noDependencyList) {
		this.s = s;
		this.i = i;
		this.arrInt = arrInt;
		this.noDependencyList = noDependencyList;
	}
}
