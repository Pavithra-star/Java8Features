package collection;
import java.util.Comparator;


class Comparator_Collection implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 age1, Employee1 age2) {
		if(age1.age==age2.age) {
			return 0;
		}
		else if(age1.age>age2.age) {
		return 1;
		
		}
		else 
		{
		return -1;
	}
}
}
  


