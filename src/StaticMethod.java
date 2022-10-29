
public class StaticMethod {
	//instance area
	static int x=68; //static variable
	int y = 96; //instance variable
	//declare an instance method
	void display()
	{
    //instance area. so we can directly call instance variable without using object reference variable  
		
		System.out.println(x);//since we can access static member within instance area.therefore we can call the static variable 
		System.out.println(y);
		
	}
	//declare a static method
	static void show()
	{
		//static area so we can call SV directly inside the SM
		int z=++x;
		System.out.println(z);
	//	System.out.println(y); //compile time error because instance variable cannot access inside SM
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the object of the class
		StaticMethod st = new StaticMethod();
		//call instance method using reference variable st
		st.display();
		//call static method
		StaticMethod.show();
	}

}
// static method can be accessed another static method and study in screenshots 