package demo;

import java.util.ArrayList;
import java.util.List;

import util.DependentClass;
import util.InjectableClass;
import util.MockableParametrizedClass;

public class DepND1A {

	public List<ArrayList<InjectableClass>> listOfLists;
	
	
	public DepND1A(List<ArrayList<InjectableClass>> listOfLists) {
		this.listOfLists = listOfLists;	
	}
}


