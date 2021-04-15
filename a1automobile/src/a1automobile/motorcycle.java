package a1automobile;

public class motorcycle extends Automobile
{
		motorcycle(int nw,int nm,int g)
		{
			super(nw,nm,g);
		}
		
		@Override
		void run() 
		{
			System.out.println("Motorcycle running");
			super.run();
		}
		@Override
		void brake() 
		{
			System.out.println("Brakes applied on motorcycle");
			super.brake();
		}
		@Override
		void change_direction() 
		{
			System.out.println("Motorcycle is turning right");
			super.change_direction();
		}
		
		
	}

