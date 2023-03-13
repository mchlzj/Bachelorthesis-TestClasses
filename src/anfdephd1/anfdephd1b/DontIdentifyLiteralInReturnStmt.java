package anfdephd1.anfdephd1b;

public class DontIdentifyLiteralInReturnStmt {
	// 0 Dependencies
	public String noDetect() {
		String s = "shouldNotBeDetected1";
		return s;
	}
	
	public String noDetect2() {
		return "shouldNotBeDetected2";
	}
	
	public String noDetect3() {
		String s;
		s ="shouldNotBeDetected3";
		return s;
	}
}
