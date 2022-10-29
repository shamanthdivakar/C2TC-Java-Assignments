import java.util.Scanner;
public class Readingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] array = new int[3];
		System.out.println("enter the array elements");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		
		}
		System.out.println("array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
	

}
