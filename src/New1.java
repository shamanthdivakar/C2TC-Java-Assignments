import java.util.Scanner;
public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2,add,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers:");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		
		System.out.println("The Addition is:"+add);
		System.out.println("The Subtraction is:"+sub);

		System.out.println("The Multiplication is:"+mul);
		System.out.println("The Division is:"+div);
		
	}

}
//if(accountNo.length==12)
//{
//	System.out.println("valid Account number");
//}	
//	else {
//	System.out.println("invalid account number");
//	break;
//	}