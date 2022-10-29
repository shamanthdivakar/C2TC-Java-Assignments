import java.util.Scanner;
public class ScannerDemo1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
	 System.out.println("Name: "+name);
	 System.out.println("gender: "+gender);
	 System.out.println("age: "+age);
	 System.out.println("mobileNo: "+mobileNo);
	 System.out.println("cgpa: "+cgpa);

	 
	}

}
