package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Comparator {

	public static void main(String[] args) {
		ArrayList<Employee1> list =new ArrayList<Employee1>();
		list.add(new Employee1(1,"radhaiii",90));
		list.add(new Employee1(2,"Radhiiiiii",12));
		Collections.sort(list, new Comparator_Collection());
	for(Employee1 l:list) {
		System.out.println(l.id+" "+l.name+" "+l.age);
	}
	System.out.println("names.....................");
	Collections.sort(list, new Comparator_Name());
	for(Employee1 l1:list) {
		System.out.println(l1.id+" "+l1.name+" "+l1.age);
	}
	}

}
