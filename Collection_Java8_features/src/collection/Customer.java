package collection;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Customer {
 private int id;
 private String name;
 private String email;
 private List<String> phoneNumbers;



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<String> getPhoneNumbers() {
	return phoneNumbers;
}

public void setPhoneNumbers(List<String> phoneNumbers) {
	this.phoneNumbers = phoneNumbers;
}

public Customer(int id, String name, String email, List<String> phoneNumbers) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phoneNumbers = phoneNumbers;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Object collect(Collector<Object, ?, List<Object>> list) {
	// TODO Auto-generated method stub
	return null;
}

public static Stream<Customer> stream() {
	// TODO Auto-generated method stub
	return null;
}

 
}
