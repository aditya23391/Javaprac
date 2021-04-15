package a1automobile;

public class Cycle extends Twowheeler 
{
	Cycle(int nw,int nm,int g)
	{
		super(nw,nm,g);
	}
	
	@Override
	void run() {
		System.out.println("Cycle running");
		super.run();
	}
	@Override
	void brake() {
		System.out.println("Brakes applied on cycle");
		super.brake();
	}
	@Override
	void change_direction() {
		System.out.println("cycle is turning left");
		super.change_direction();
	}
	
	
}
