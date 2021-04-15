package assg2;


public class circle extends shape
{
	double p=0;
	double ar=0;
	int r=6;
   
	@Override
	public void periphery()
	{
			p=2*pi*r;
			System.out.println("Periphery of circle is:"+ p);
			super.periphery();
	}
	
	@Override
	public void area()
	{
		ar=pi*r*r;
		System.out.println("Area of circle is:"+ ar);
		super.area();
	}
}
