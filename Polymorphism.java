
class Polymorphism {

	public int add(int x, int y) {
		return x+y;
	}
	
	public int add(int x, int y, int z)
	{
		return x+y+z;
	}
	
	public int add(double x, int y)
	{
		return (int)x+y;
	}
		
	public int add(int x, double y)
	{
		return x+(int)y;
	}
		
		static class Test {
			
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			Polymorphism demo = new Polymorphism();
			System.out.println(demo.add(2, 3));
			
			System.out.println(demo.add(2, 3, 4));

			System.out.println(demo.add(2, 3.4));

			System.out.println(demo.add(2.5, 3));
			


	}

}
}
