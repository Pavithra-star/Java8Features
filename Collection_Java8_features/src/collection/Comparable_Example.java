package collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int sid;
	String sname;
	int age;
	Student(int sid, String sname, int age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	@Override
	public int compareTo(Student str) {
		if (age == str.age)
			return 0;
		else if (age > str.age)
			return 1;
		else
			return -1;
	}
}
public class Comparable_Example {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(1, "radha", 18));
		a1.add(new Student(2, "radha", 12));
		a1.add(new Student(3, "radha", 58));

		Collections.sort(a1);
		for (Student str : a1) {

			System.out.println(str.sid + " " + str.sname + " " + str.age);
		}
	}

}
