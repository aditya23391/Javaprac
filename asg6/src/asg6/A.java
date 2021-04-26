/*Problem Statement
Create a abstract class A.
Inside A write abstract function display().
Inside A write non-abstract function show().
Write class B that inherites A.
Override display.
Create an object of B and call the functions.
 */

package asg6;

public abstract class A 
{
	public abstract void display();
	public void show()
	{
		System.out.println("show calling from A");
	}




public static void main(String args[])
{
	B obj1=new B();
	obj1.display();
	obj1.show();
}
}