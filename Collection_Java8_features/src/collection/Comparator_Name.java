package collection;

import java.util.Comparator;

public class Comparator_Name implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 name1, Employee1 name2) {
return name1.name.compareTo(name2.name)	;
}
}