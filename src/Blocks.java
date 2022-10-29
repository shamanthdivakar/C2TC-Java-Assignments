
public class Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for(num = 1;num<=10;num++)
		{
			try {
				if(num == 5)
				
					throw new ArithmeticException("artithemetic exception");
				
					else if(num<2)
					
					
						throw new RuntimeException("runtime exception");
					
					else if(num>9)
					
						throw new NullPointerException("null poiner exception ");
					
				}
				catch(Exception e)
				{
					System.out.println("caught an exception");
					System.out.println(e.getMessage());
				}
			}
		}
	}


