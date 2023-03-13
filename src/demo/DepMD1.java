package demo;

import util.DependentClass;
import util.DependentClassFactory;

public class DepMD1 {

	public DepMD1() {
		
	}
	
}

interface Mockable {
	String getValue();
}
class RealObj implements Mockable {

	@Override
	public String getValue() {
		return DependentClassFactory.getObj().getString();
	}
}
class FakeObj implements Mockable {

	@Override
	public String getValue() {
		return "Fixed Value for Testing";
	}
}


