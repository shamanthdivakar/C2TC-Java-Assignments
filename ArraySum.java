
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array and 
		//initialize it with values
		int array[] = {10,20,30,40,50};
		//initalize sum variable with 0
		int sum = 0;
		//add array elemetns
		for(int i=0;i<array.length;i++)
		{
			sum += array[i]; //sum = sum+ array[i];
	}
	//display the result
	System.out.println("sum of array elements=" +sum);
}


}
