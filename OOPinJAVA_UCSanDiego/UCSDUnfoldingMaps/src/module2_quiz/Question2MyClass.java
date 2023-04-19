package module2_quiz;

public class Question2MyClass {
	
	private int a;
	public double b;
	
	public Question2MyClass (int first, double second) {
		this.a = first;
		this.b = second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2MyClass c1 = new Question2MyClass(10,20.5);
		Question2MyClass c2 = new Question2MyClass(10,31.5);
		// lines below are changed from the Question1MyClass
		c2 = c1;
		c1.a = 2;
		System.out.println(c2.a);
	}

}
