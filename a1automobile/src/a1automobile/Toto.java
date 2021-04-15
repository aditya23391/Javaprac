package a1automobile;

public class Toto extends Automobile
{

	Toto(int nw,int nm,int g)
	{
		super(nw,nm,g);
			
	}
	
	public void display()
	{
		
	}
	@Override
	public void run()
	{
		System.out.println("Toto running");
		super.run();
    }

	@Override
	void brake()
	{
		System.out.println("Brakes applied on toto");
		super.brake();
	}

	@Override
	void change_direction() 
	{
		System.out.println("Toto is turning left");
		super.change_direction();
	}
	
	
	
}
