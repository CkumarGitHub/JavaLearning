package OOPSConcepts;

public class WrapperClass {

	public static void main(String[] args) {
		String x="100";
		int i=Integer.parseInt(x);
		System.out.println(i);
		
		String y= "12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		int j=100;
		String s=Integer.toString(j);
		//String s=String.valueOf(j);
		System.out.println(s+100);
		
	}

}
