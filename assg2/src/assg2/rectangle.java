package assg2;

public class rectangle extends shape
{
  int p2=0;
  int ar2=0;
  int l=5, b=6, h=4;
  
  public void periphery()
  {
	    p2=2*(l+b);
		System.out.println("Periphery of rectangle is:"+ p2);
  }
  
  public void area()
	{
		ar2=l*b;
		System.out.println("Area of rectangle is:"+ ar2);
	}
  
  
}
