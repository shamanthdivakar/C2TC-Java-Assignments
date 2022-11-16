
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		 names.add("Shamanth");
		 names.add("Nisha");
		 names.add("sam"); 
		 names.add("rakesh");
		 names.add("rakeshravi");
		 List<String> namesEndingWith_i = names.stream() // create a stream
		 
		 
		 		.filter(name -> name.charAt(name.length()-1)=='a') // intermediate step 
		 		.sorted() //will sort the stream in ascending order
		 		.collect(Collectors.toList());
		 		namesEndingWith_i.forEach(System.out::println);
		 		// we can also write by using lambda expression
		 		namesEndingWith_i.forEach(s->System.out.println(s));

		 
	}
}
