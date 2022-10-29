import java.util.Scanner;

public class Neww {
public 	void Welcome() {
		System.out.println("Welcome to shamanth's Banking Application");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Scanner ob = new Scanner(System.in);
		System.out.println("enter the account type\n");
		System.out.println("1.Current");
		System.out.println("2.savings");
		int decide = ob.nextInt();
		
		switch(decide)
		{
		case 1: Scanner ob1 = new Scanner(System.in);
		
				System.out.println("enter the name of the account holder:");
				String name = sc.nextLine();
				
				System.out.println("enter the Account number:");
				int accountNo = sc.nextInt();
				
				
				long totamt = 1000000;
				long updatedamt=0;
		
				System.out.println("Account holder name:"+name);
				System.out.println("Account number:"+accountNo);
				System.out.println("Balance:"+totamt);
				System.out.println("Do want to Deposite or Withdraw money");
				System.out.println("3. for Deposite");
				System.out.println("4. for Withdraw");

				int decid = ob1.nextInt();
				switch(decid)
				{
				case 3: System.out.println("enter the deposite amount");
				        long deposite = sc.nextLong();
		                updatedamt = totamt+deposite;
		                System.out.println("The updated amount is:"+updatedamt);
		                break;
				
				case 4: System.out.println("enter the withdrawal amount\n");
				        long withdraw = sc.nextLong();
				        updatedamt = totamt-withdraw;
				        System.out.println("The updated amount is:"+updatedamt);
				        break;
				 }
				
		
		case 2:  Scanner ob2 = new Scanner(System.in);
				 Scanner sc2 = new Scanner(System.in);
				 
		         System.out.println("enter the name of the account holder:");
				 String namee = sc2.nextLine();
					
				 System.out.println("enter the Account number:");
				 long[] accountNoo = new long[11];
				 if(accountNoo.length==12)
				 {
					 
				
				 long totamount = 100000;
				 long updatedamount=0;
			
				 System.out.println("Account holder name:"+namee);
				 System.out.println("Account number:"+accountNoo);
				 System.out.println("Balance:"+totamount);
				 System.out.println("Do want to Deposite or Withdraw money");
				 System.out.println("5. for Deposite");
				 System.out.println("6. for Withdraw");
			
				 int decidee = sc2.nextInt();
				switch(decidee)
				{
		
				case 5: System.out.println("enter the deposite amount");
				        long depositee = sc2.nextLong();
		                updatedamount = totamount+depositee;
		                System.out.println("The updated amount is:"+updatedamount);
		                break;
				
				case 6: System.out.println("enter the withdrawal amount\n");
				        long withdraww = sc2.nextLong();
				        updatedamount = totamount-withdraww;
				        System.out.println("The updated amount is:"+updatedamount);
				        break;
		        }
				 }
				 else {
					 System.out.println("Invalid account number");
				 }
		
		
		
		}

	}	 
}
	

