package assg2;

public class Square extends rectangle 
{
  int pr3=0;
  int ar3=0;
  int a=5;
  
  @Override
  public void area()
  {
	  ar3=a*a;
	  System.out.println("Area of square is:"+ ar3);
	  super.area();
  }
	
  @Override
  public void periphery()
  {
	  pr3=4*a;
	  System.out.println("Periphery of square is:"+ pr3);
	  super.periphery();
  }
}
