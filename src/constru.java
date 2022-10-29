import java.util.*;
public class constru {

	constru() //default constructor
	{
		System.out.println("Hi this is constructor");
		
	}
	void display()
	{
		System.out.println("Hi this is the method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		switch(c) {
		case 1: 		
			constru ob = new constru(); 
			ob.display();     
		}
		                //constructor will be called
	}

}
