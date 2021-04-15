package complex;

public class A {
	
	int a;
	int b;
	
	 
	public void add(int a,int b)
	{
		int Sum;
		Sum=a+b;
		System.out.println("The Sum is:" +Sum);
	}
	
	public void diff(int a,int b)
	{ 
		int Diff;
		Diff=a-b;
		System.out.println("The Difference is:" +Diff);
	}
	
	

	public static void main(String[] args)
	{
		A o1=new A();
		o1.add(5,3);
		o1.diff(7,5);
		
		Complex_A C1=new Complex_A(9,7);
		Complex_A C2=new Complex_A(5,3);
		
		Complex_A C3=new Complex_A(0,0);
		C3=C3.addcomplex(C1, C2);
		System.out.println("Sum of Complex Number is:" + C3.a +" +"+ C3.b+"i");
		
		Complex_A C4=new Complex_A(0,0);
		C4=C4.DiffComplex(C1, C2);
		System.out.println("Difference of Complex Number is:" + C4.a +" +"+ C4.b+"i");
		
	}

}
