import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Streamopera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		System.out.println("original list:"+numbers);
		List<Integer>even = numbers.stream()
				.map(s -> Integer.valueOf(s))
				.filter(number -> number%2==0)
				.collect(Collectors.toList());
		
		System.out.println("Processed list, only even numbers" +even); 
	}

}
