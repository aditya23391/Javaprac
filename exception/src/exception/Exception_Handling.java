package exception;

import java.util.Scanner;
public class Exception_Handling 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			int c;
			System.out.println("Select the Exception Type:\n 1.Arithmetic\n 2.NumberFormat\n 3.ArrayOutOfBound\n 4.StringIndexOutOfBounds\n ");
			c = sc.nextInt();
			switch(c)
			{
			case 1: int a=10, b=0;
			        int d=a/b;
			        System.out.println("Result=" +d);
			        break;
			    
			case 2: int n = Integer.parseInt("aditya");
			        System.out.println(n);
			        break;
			        
			case 3: int arr[] = new int[5];
			        arr[6] = 9;
			        break;
			    
			case 4: String s = "This is exception";
			        char ch = s.charAt(20);
			        System.out.println(ch);
			        
			        break;
		    }
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide number by 0");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println("Array index is out of bound");
			
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index is out of bound");
		}
		
		finally 
		{
			System.out.println("Finally block is executing");
		}
		sc.close();
    }
}
