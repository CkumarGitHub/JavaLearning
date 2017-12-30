package OOPSConcepts;

public class StaticNonStatic {
	
	String name="Chandan";
	static int age=28;
	
	public static void main(String[] args) {

	sum();
	StaticNonStatic.sum();
	StaticNonStatic obj=new StaticNonStatic();
	
	System.out.println(obj.age);
	System.out.println(obj.name);	
	obj.sendMail();
	obj.sum();
	
	
	}
	
	public void sendMail() {
		
		System.out.println("sendMail method");
		
	}
	
	public static void sum() {
		
		System.out.println("sum method");
	}

}
