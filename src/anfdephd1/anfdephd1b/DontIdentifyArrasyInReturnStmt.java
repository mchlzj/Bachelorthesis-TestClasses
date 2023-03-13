package anfdephd1.anfdephd1b;

public class DontIdentifyArrasyInReturnStmt {

	// 2 Dependencies
	int[] intArr;
	
	public DontIdentifyArrasyInReturnStmt() {
		
		intArr = new int[3];
		
		int[] anotherIntArr = {1};
	}
	
	public int[] getIntendedDependency() {
		int[] arr = new int[2];
		return arr;
	}
	
	public int[] getAnotherIntendedDependency() {
		return new int[2];
	}
	
	public int[] getAnotherIntendedDependency2() {
		int[] arr = {1};
		return arr;
	}
}
