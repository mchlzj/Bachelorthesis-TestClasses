package util;

public class DependentClass {

	private static String globalDependency = "GlobalDependencyString";
	
	public static String globalDependencyField = "GlobalDependencyField";
	
	public static final String GLOBAL_CONSTANT = "GlobalConstant";
	String s1;
	
	private PlaceholderClass class1;
	private PlaceholderClass class2;
	
	public DependentClass(PlaceholderClass class1, PlaceholderClass class2) {
		this.class1 = class1;
		this.class2 = class2;
	}
	public DependentClass() {
		
	}
	
	public DependentClass(String s1, String s2) {
		
	}
	
	public DependentClass(NestedClass nestedClass) {
		
	}
	
	public String getString() {
		return "String";
	}
	
	public static String getGlobalDependency() {
		return globalDependency;
	}
	
	public static void changeGlobalDependency(String s) {
		globalDependency = s;
	}
	
	public void setString(String s) {
		this.s1 = s;
	}
}
