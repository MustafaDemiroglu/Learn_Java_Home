// Just a test for to understand the Inheritance Hierarchy!
/*
	in main
	Person [] p = new Person [3] ;
	p[0] = new Person ();
	p[1] = new Student ();
	p[2] = new Faculty ();
*/

package module4_classInheritance;

public class Person {
	
	private String name;
	
	public Person (String n) {
		this.name = n ;
		System.out.println("#1 ");
	}

}
