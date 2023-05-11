// Just a test for to understand the Inheritance Hierarchy!

package module4_classInheritance;

public class Student extends Person {
	
	public Student () {
		this ("Student") ;
		System.out.println("#2 ");
	}
	
	public Student(String n) {
		super(n);
		System.out.println("#3 ");
	}

}

