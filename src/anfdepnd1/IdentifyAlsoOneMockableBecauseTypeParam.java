package anfdepnd1;

import java.util.List;

import util.Mockable;
import util.MockableClass;

public class IdentifyAlsoOneMockableBecauseTypeParam {
	// 1 Mockable 3 No Dependency
	String s;
	int i;
	int[] arrInt;
	List<MockableClass> mockableList;
	
	public IdentifyAlsoOneMockableBecauseTypeParam(String s, int i, int[] arrInt, List<MockableClass> mockableList) {
		this.s = s;
		this.i = i;
		this.arrInt = arrInt;
		this.mockableList = mockableList;
	}
}
