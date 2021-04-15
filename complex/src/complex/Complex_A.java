package complex;

public class Complex_A extends A 
{
	int a,b;
	
	Complex_A()
	{
		a=0;
		b=0;
	}
	
	Complex_A(int tempReal,int tempImg)
	{
		a = tempReal;
		b = tempImg;
	}
	
  public Complex_A addcomplex(Complex_A C1,Complex_A C2)
  {
  
	  Complex_A temp = new Complex_A(0,0);
	  temp.a=C1.a + C2.a;
	  temp.b=C1.b + C2.b;
	  return temp;
	  
	}
  
  public Complex_A DiffComplex(Complex_A C1,Complex_A C2)
  {
	  Complex_A temp = new Complex_A(0,0);
	  temp.a=C1.a - C2.a;
	  temp.b=C1.b - C2.b;
	  return temp;
	  
  }

}
