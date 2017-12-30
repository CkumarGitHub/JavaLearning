package OOPSConcepts;

public class CallByValAndCallbyref {

	int p;
	int q;
	
	public static void main(String[] args) {

		int x=10;
		int y=20;
		CallByValAndCallbyref obj =new CallByValAndCallbyref();
		obj.testSum(x, y); //call by value
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);//call by reference
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int testSum(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public void swap(CallByValAndCallbyref obj1) {
		int temp;
		temp=obj1.p;
		obj1.p=obj1.q;
		obj1.q=temp;
		
		
	}

}
