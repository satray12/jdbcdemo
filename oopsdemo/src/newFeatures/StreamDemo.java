package newFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamDemo {

	public static void main(String[] args) {
		List<String> city=Arrays.asList("Delhi","Mumbai","Dhanbad","Daman","Bangaluru");
		
		city.stream().sorted().forEach(System.out::println);
		
		System.out.println();
		
		
		// operation by creating a stream
		city.stream().filter(s->s.startsWith("D")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		List bCity=city.stream().filter(s->s.startsWith("D")).
				map(String::toUpperCase).
				collect(Collectors.toList());
		
		System.out.print(bCity);
		bCity.forEach(c->System.out.print(c));
		
		
		

	}

}
