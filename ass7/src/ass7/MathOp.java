/*Problem Statement
Create a abstract class A.
Inside A write abstract function display().
Inside A write non-abstract function show().
Write class B that inherites A.
Override display.
Create an object of B and call the functions.*/
package ass7;


public abstract class MathOp 
{
	
	public abstract void addition1(int a,int b);
	public abstract void subtraction1(int a,int b);
	public abstract void multiplication(int a,int b);
	public abstract void division(int a,int b);
	
	

	public static void main(String[] args) 
	{
        A obj=new A();
        obj.addition1(5, 6);
        obj.subtraction1(9, 4);
        obj.multiplication(4, 3);
        obj.division(6, 3);
	}

}
