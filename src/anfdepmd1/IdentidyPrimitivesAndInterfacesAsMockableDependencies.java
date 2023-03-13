package anfdepmd1;

import java.util.List;

import util.MockableClass;

public class IdentidyPrimitivesAndInterfacesAsMockableDependencies {

	String s;
	int i;
	int[] arrInt;
	MockableClass mockable;
	List<MockableClass> mockableList;
	
	public IdentidyPrimitivesAndInterfacesAsMockableDependencies(String s, int i, int[] arrInt, MockableClass mockable, List<MockableClass> mockableList) {
		this.s= s;
		this.i = i;
		this.arrInt = arrInt;
		this.mockable = mockable;
		this.mockableList = mockableList;
	}
}
