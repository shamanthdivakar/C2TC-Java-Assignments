
public class ThrowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=0;
		try
		{
			int z=x/y;
			throw new ArithmeticException();
		//	System.out.println("Result:" +z);  //Unreachable code.
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Excpetion caught:\n" +ae);
		}

	}

}
