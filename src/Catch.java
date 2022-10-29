
public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[6];
			arr[9] = 20/0;
			System.out.println("I am try block");
		
		}
		catch(ArithmeticException ae)
		{
			System.out.println("A number cannt be divided by zer0");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("accessing array element outside of specified limit");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("I am out of try block");
		
	}
	

}
