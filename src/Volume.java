import java.util.Scanner;

public class Volume {

	void volume(int s)
	{
		int cube;
		cube=s*s*s;
		System.out.println("volume of the cube is:"+cube);
	}
	
	void volume(int l,int b,int h)
	{
		int cuboid=l*b*h;
		

		System.out.println("the volume of cuboid is:"+cuboid);
	}
	void volume(double r)
	{
		
		double sphere=4/3*3.14159*r*r*r;
		
		System.out.println("the volume of sphere is:"+sphere);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume ob = new Volume();
		ob.volume(4);
		ob.volume(3.141);
		ob.volume(3,4,5);

		
	}

}
