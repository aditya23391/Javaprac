/*Create an abstract class Motorcycle. It have a abstract function 'start'. 
It also have a non-abstract funtion have_tyres. Print "I have two tyres.".
 Next, create two classes old_bike and new_bike. Both extends class Motorcycle.
 In starts function of old_bike, print 'I start with kick.'
 In starts function of old_bike, print 'I have self start.'
 Call functions from main.*/
package ass8;

public abstract class Motorcycle 
{
	public abstract void start();
	public void Have_tyres()
	{
		System.out.println("I have two tyres");
	}

	public static void main(String[] args)
	{
		Old_bike obj1=new Old_bike();
		obj1.start();
		obj1.Have_tyres();
		
		New_bike obj2=new New_bike();
		obj2.start();
		obj2.Have_tyres();
	}

}
