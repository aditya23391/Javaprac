package ass5;

public class Hacker extends Programmer
{
  
   @Override
	public void display()
	{
		System.out.println("Your code is hacked");
		super.display();
	}
		
}
