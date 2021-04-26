package ass7;

public class A extends MathOp 
{
	int c;

	@Override
	public void addition1(int a, int b)
	{
		c=a+b;
		System.out.println("sum is:" +c);
		
	}

	@Override
	public void subtraction1(int a, int b) 
	{
		c=a-b;
		System.out.println("Difference is:" +c);
		
	}

	@Override
	public void multiplication(int a, int b)
	{
		c=a*b;
		System.out.println("Product is:" +c);	
	}

	@Override
	public void division(int a, int b) 
	{
		c=a/b;
		System.out.println("Dvision is:" +c);
	}
	

}
