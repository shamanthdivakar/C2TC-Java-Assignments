import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cons;
		System.out.println("pay tax for water consumption\n");
		System.out.println("Enter the consumed water in gallons");
		cons = sc.nextInt();
		if(cons<45)
			{System.out.println("No Tax");}
		else if(cons>45 && cons<75) {System.out.println("tax is 475");}
		else if(cons>75 && cons<125) {System.out.println("tax is 750");}
		else if(cons>125 && cons<200) {System.out.println("tax is 1225");}
		else if(cons>200 && cons<350) {System.out.println("tax is 1650");}
		else if(cons>350) {System.out.println("Tax is 2000");}
	}
	

}
