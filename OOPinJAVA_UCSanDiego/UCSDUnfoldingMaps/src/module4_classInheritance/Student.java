// Just a test for to understand the Inheritance Hierarchy!

package module4_classInheritance;

public class Student extends Person {
	
	public void method1() {
        System.out.print("Student 1 ");
        super.method1();
        method2();
    }
    public void method2() {
        System.out.print("Student 2 ");
    }

}

