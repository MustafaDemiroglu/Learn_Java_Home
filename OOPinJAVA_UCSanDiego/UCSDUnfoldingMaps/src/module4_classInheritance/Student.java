// Just a test for to understand the Inheritance Hierarchy!

package module4_classInheritance;

public class Student extends Person {
	
	public Student(String name)  {
	    super(name);
	  }

	  public boolean isAsleep( int hr ) // override 
	  { return 2 < hr && 8 > hr; }

}

