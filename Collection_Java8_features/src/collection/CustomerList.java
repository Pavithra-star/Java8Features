package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerList {
	public static List<Customer> getAll(){
		return Stream.of(
		new Customer(1,"radha","radha@gmail.com",Arrays.asList("9603973990","23621523")),
		new Customer(2,"rani","rani@gmail.com",Arrays.asList("8503973990","23625445523")),
		new Customer(3,"latha","latha@gmail.com",Arrays.asList("8503973990","24221523")),
		new Customer(4,"sita","sita@gmail.com",Arrays.asList("9563973990","2121523")),
		new Customer(5,"ramu","ramu@gmail.com",Arrays.asList("9895973990","265238523")))
				.collect(Collectors.toList());
	}
}