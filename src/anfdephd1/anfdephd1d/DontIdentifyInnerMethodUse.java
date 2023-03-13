package anfdephd1.anfdephd1d;

public class DontIdentifyInnerMethodUse {

	// 0 Dependencies
	public DontIdentifyInnerMethodUse() {
		String s1 = innerUsedMethod();
		
		String s2;
		s2 = innerUsedMethod();
		
		anotherInnerUsedMethod();
	}
	
	
	private String innerUsedMethod() {
		return "String";
	}
	
	private void anotherInnerUsedMethod() {
		
	}
}
