package collection;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;



public class CustumerMainClass {

	public static void main(String[] args) {
List<Customer> customer1=CustomerList.getAll();
//List<Customer convert List<String - > Data transformation
//mapping :customer.getEmail()
//ccustomer-> customer.getEmail() one to one
List<String> emails=customer1.stream().map(custom -> custom.getEmail()).collect(Collectors.toList());
System.out.println(emails);
//one to Many map mapping
List<List<String>> phonenumber=customer1.stream().map(cus -> cus.getPhoneNumbers()).collect(Collectors.toList());
System.out.println(phonenumber);
	
	}
}