import java.util.Scanner;
public class mulofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if(num%3==0)
		System.out.println("Number is multiple of three");
	else
		System.out.println("Number is not a multiple of three");

			
	}

}
