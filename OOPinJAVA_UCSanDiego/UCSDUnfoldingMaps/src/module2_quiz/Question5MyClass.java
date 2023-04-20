package module2_quiz;

public class Question5MyClass {
	
	private int a ;
	public double b ;
	
	public Question5MyClass (int first, double second) {
		this.a = first ;
		this.b = second ;
	}
	
	public static void incrementBoth (Question5MyClass c1) {
		c1.a = c1.a + 1 ;
		c1.b =c1.b + 1.0 ;
	}
	
	//new Method
	public static void incrementA (int first) {
		first = first + 1 ;
	}
	
	//new Method
	public static void incrementB (double second) {
		second = second + 1.0 ;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5MyClass c1 = new Question5MyClass(10,20.5);
		Question5MyClass c2 = new Question5MyClass(10,31.5);
		// different code below
		incrementA(c2.a);
		incrementB(c2.b);
		System.out.println(c2.a + ", " + c2.b);
	}

}
