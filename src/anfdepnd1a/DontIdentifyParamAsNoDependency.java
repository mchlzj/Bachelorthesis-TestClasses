package anfdepnd1a;

import java.util.ArrayList;
import java.util.List;

import util.DependentClass;

public class DontIdentifyParamAsNoDependency {
	List<ArrayList<DependentClass>> objList;
	
	public DontIdentifyParamAsNoDependency(List<ArrayList<DependentClass>> objList) {
		this.objList  =  objList;	
	}
}
