import java.util.Scanner;
public class lights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the timing");
		int time = sc.nextInt();
		
		if(time>=17)
			System.out.println("Lights on 1");
		else 
			System.out.println("Lights Off 0");
	}

}
