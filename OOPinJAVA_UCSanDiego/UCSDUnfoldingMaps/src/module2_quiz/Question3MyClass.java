package module2_quiz;

public class Question3MyClass {
	
	private int a;
	public double b;
	
	public Question3MyClass (int first, double second) {
		this.a = first;
		this.b = second;
	}
	
	// new Method
	public static void incrementBoth (Question3MyClass c1) {
		c1.a = c1.a + 1 ;
		c1.b = c1.b + 1.0 ;
	}
	
	public static void main (String [] args) {
		Question3MyClass c1 = new Question3MyClass (10, 20.5);
		Question3MyClass c2 = new Question3MyClass (10, 31.5);
		// different code below
		incrementBoth(c2);
		System.out.println(c1.a + " , " + c2.a);
	}

}
