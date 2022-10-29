import java.util.Scanner;
public class Commission {

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Sales_amt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		System.out.println("enter the address");
		System.out.println("enter the phone number");
		System.out.println("enter the sales amount");
		String name = sc.nextLine();
		String address = sc.nextLine();
		long phone = sc.nextLong();
		Sales_amt = sc.nextInt();
		if (Sales_amt >= 100000)
			{
				System.out.println("the commission is 10%");
			}
		else if(Sales_amt>=50000 && Sales_amt<100000) 
		{
				System.out.println("the Commission is 5%");
		}
		else if(Sales_amt>=30000 && Sales_amt<50000)
		{
			System.out.println("the commission is 3%");
		}
		else 
		{
			System.out.println("No Commission");
		}
	}
		
	}


