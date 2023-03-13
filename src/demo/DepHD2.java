package demo;

import util.GlobalClass;

public class DepHD2 {

	public DepHD2() {
		String s = GlobalClass.getValue();
	}
	public void modifyGlobalValue() {
		GlobalClass.setValue("new Value");
		GlobalClass.value = "another new Value";
	}
	
	
	
	
}
