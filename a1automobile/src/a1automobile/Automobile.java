package a1automobile;

public class Automobile
{
	int no_wheel;
	int no_mirror;
	int gear;
	
	Automobile(int nw,int nm,int g)
	{
		no_wheel=nw;
		no_mirror=nm;
		gear=g;
	}
	void run()
	{
		
	}
	void brake()
	{
		
	}
	void change_direction()
	{
		
	}

	

public static void main(String[] args) 
{
       Toto o1=new Toto(3,3,4);
	  	System.out.println("\nToto\n");
	  	System.out.println("Wheels:" + o1.no_wheel + "\tMirror:" + o1.no_mirror + "\tGear:" + o1.gear);
	  	o1.run();
	  	o1.brake();
	  	o1.change_direction();
	  	
	  	Twowheeler o2=new Twowheeler(2,2,5);
	  	System.out.println("\nTwowheeler\n");
	  	System.out.println("Wheels:" + o2.no_wheel + "\tMirror:" + o2.no_mirror + "\tGear:" + o2.gear);
	  	o2.run();
	  	o2.brake();
	  	o2.change_direction();
	  	
	  	Cycle o3=new Cycle(2,2,1);
	  	System.out.println("\nCycle\n");
	  	System.out.println("Wheels:" + o3.no_wheel + "\tMirror:" + o3.no_mirror + "\tGear:" + o3.gear);
	  	o3.run();
	  	o3.brake();
	  	o3.change_direction();
	  	
	  	motorcycle o4=new motorcycle(2,2,5);
	  	System.out.println("\nMotorcycle\n");
	  	System.out.println("Wheels:" + o4.no_wheel + "\tMirror:" + o4.no_mirror + "\tGear:" + o4.gear);
	  	o4.run();
	  	o4.brake();
	  	o4.change_direction();
	}

}