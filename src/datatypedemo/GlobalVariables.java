package datatypedemo;

public class GlobalVariables {
	int i;
	int j;
	public static void main(String[] args) {
		GlobalVariables obj = new GlobalVariables();
		obj.i=50;
		obj.j=60;
		System.out.printf("%d,%d \n",obj.i,obj.j);
		
		obj.test(obj);
	}
	public void test(GlobalVariables obj2)
	{
//		String str= "1000";
//		int j=Integer.parseInt(str);
//		System.out.println(this.i + j);
//		int i=200;
//		String k=String.valueOf(i);
//		System.out.println(i+k);
		int temp;
		temp=obj2.i;
		obj2.i=obj2.j;
		obj2.j=temp;
		System.out.printf("%d,%d \n",obj2.i,obj2.j);
		
		
	}

}
