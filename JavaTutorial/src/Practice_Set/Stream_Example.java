 package Practice_Set;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Example {	

	public static void main(String[] args) {
		
		// create a list of integers
		List<Integer> number = Arrays.asList(2,4,6,8);
		
		// demonstration of map method
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());   
		System.out.println(square);
		 
		// create a list of String
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		System.out.println(names);
		
		// demonstration of filter method
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		 //demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		// create a list of integers
		List<Integer> number2 = Arrays.asList(2,3,4,5,2);
	    System.out.println(number2);
		
		 // collect method returns a set
		Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);

	    // demonstration of forEach method
		number.stream().map(x->x*x).forEach(y->System.out.println(y));

	    // demonstration of reduce method
		int even=
		
		number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		
		System.out.println(even);
	}

}
