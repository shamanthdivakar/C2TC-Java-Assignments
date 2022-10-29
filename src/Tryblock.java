
public class Tryblock {
	public static void main(String[] args)
	{
		try {
			int x[] = {0,1,2};
		try {
			int y[] = {0,10};
			int z = x[2]/y[0];
			System.out.println("Division of two numbers:"+z);
			
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Inside inner try catch block");
			System.out.println(aie.toString());
			
		}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside outer try catch block");
			System.out.println(ae.toString());
			
		}
		System.out.println("I am out of outer catch block");
		
	}
}
