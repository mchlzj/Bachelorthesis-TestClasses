package anfdephd1.anfdephd1a;

import util.DependentClass;
import util.NestedClass;

public class DontIdentifyNestedNewKeywords {

	public DontIdentifyNestedNewKeywords() {
		DependentClass obj = new DependentClass("String1", "String2");
	}
	
	public void noDetect() {
		String s1 = "noDetect1";
		String s2;
		s2 = "noDetect2";
		DependentClass obj = new DependentClass(s1,s2);
	}
	
	public DependentClass noDetect2() {
		String s1 = "noDetect1";
		String s2;
		s2 = "noDetect2";
		DependentClass obj = new DependentClass(s1,s2);
		return obj;
	}
	
	public void  noDetect3() {
		DependentClass obj = new DependentClass(new NestedClass());
	}
}
