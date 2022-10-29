import java.util.Scanner;
//single inheritance
public class Withdraw //parent class
{
	int amt_with=1000; 	//Data members of parent class
}
public class atm extends Withdraw {//child class 

	int amt_left=15000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//atm ob=new atm();
		Withdraw ob=new Withdraw();
		System.out.println("amt withdraw"+ ob.amt_with);
		System.out.println("amt left"+ ob.amt_left);

	}

}
