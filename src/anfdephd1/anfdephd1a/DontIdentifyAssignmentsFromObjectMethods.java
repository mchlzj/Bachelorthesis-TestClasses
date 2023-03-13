package anfdephd1.anfdephd1a;


import util.DependentClass;

public class DontIdentifyAssignmentsFromObjectMethods {

	// 4 Dependencies
	public DontIdentifyAssignmentsFromObjectMethods() {
		
		DependentClass obj = new DependentClass();
		String s;
		s = obj.getString();
		
	}
	
	public void noDetect() {
		DependentClass obj = new DependentClass();
		String s1 = obj.getString();
	}
	
	public void noDetect2() {
		DependentClass obj;
		obj = new DependentClass();
		String s1;
		s1 = obj.getString();
	}
	
	public void noDetect3() {
		DependentClass obj;
		obj = new DependentClass();
		
		String s = obj.getString();
		
	}
}
