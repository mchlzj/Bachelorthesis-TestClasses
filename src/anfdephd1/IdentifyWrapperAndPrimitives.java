package anfdephd1;

public class IdentifyWrapperAndPrimitives {

	// 18 Dependencies
	private Byte b;
	private Character c;
	private Short s;
	private Integer i;
	private Long l;
	private Float f;
	private Double d;
	private Boolean bool;
	private String string;
	
	public IdentifyWrapperAndPrimitives() {
		b = 1;
		c = 1;
		s = 1;
		i = 1;
		l = (long) 1;
		f = (float) 1;
		d = (double) 1;
		bool = true;
		string = "String";
		 
		b = new Byte("test");
		c = new Character('A');
		s = new Short("short");
		i = new Integer(1);
		l = new Long(1);
		f =  new Float(1);
		d =  new Double(1);
		bool = new Boolean(false);
		string = new String("String2");
	}
}
