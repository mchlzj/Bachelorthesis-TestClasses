package anfdephd1;


import util.DependentClass;

public class IdentifyObjectsWithThisKeyword {

	// 2 Dependencies
	private DependentClass dependent;
	
	public IdentifyObjectsWithThisKeyword() {
		this.dependent = new DependentClass();
	}
	
	public void setDependent() {
		this.dependent = new DependentClass();
	}
}
