import java.util.Scanner;
public class Username {
	private static String usr; 
	static void validate() throws Usr
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		System.out.println("Your username should only contain 3 uppercase 2 lowercase and 1 special character");
		usr = sc.next();
		
		if(usr.length()==6)
		{
			if(usr.charAt(0) == 83 && usr.charAt(1) == 65 && usr.charAt(2) == 77)
			{
				if(usr.charAt(3) == 110 && usr.charAt(4) == 105)
				{
					if(usr.charAt(5) == 64)
					{
						System.out.println("the Username is valid! yoyo");
						
					}
				}
		    }
			else {
				System.out.println("username is invalid(sad)");
			} 
		}
		}
	public static void main(String[] args){
	{
		try {
			validate();
			
		}
		catch(Exception e)
		{
			System.out.println("I Just caught an exception\n"+e);
			
		}
	}
	
	}
}

		
		// TODO Auto-generated method stub

	

	
	
