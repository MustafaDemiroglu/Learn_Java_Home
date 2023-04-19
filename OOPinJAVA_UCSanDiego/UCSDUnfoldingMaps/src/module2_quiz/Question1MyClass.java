package module2_quiz;

public class Question1MyClass {
	
	private int a;
	public double b;
	
	public Question1MyClass (int first, double second) { 
		this.a = first;
		this.b = second ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1MyClass c1 = new Question1MyClass (10,20.5);
		Question1MyClass c2 = new Question1MyClass (10,31.5);
		System.out.println(c1.a + " , " + c1.b);
	}

}
