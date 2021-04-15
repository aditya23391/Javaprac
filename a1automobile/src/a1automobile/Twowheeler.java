package a1automobile;

public class Twowheeler extends Automobile
{

	Twowheeler(int nw,int nm,int g)
	{
		super(nw,nm,g);
	}
	
    @Override void run() 
	{
		System.out.println("Twowheeler running");
		super.run();
	}
    @Override
	void brake() 
	{	    System.out.println("Brakes applied on twowheeler");
		super.brake();
	}
	@Override
	void change_direction() 
	{
		System.out.println("twowheeler is turning left");
		super.change_direction();
	}
	
}
