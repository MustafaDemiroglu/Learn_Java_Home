package module4_classInheritance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p[] = new Person[3];
		p[0] = new Person( "Tim" );
		p[1] = new Student( "Cara", 1234);
		p[2] = new Faculty( "Mia", "ABCD" );

		for(int i = 0; i < p.length; i++)
		{
		  System.out.println( p[i] );
		}

	}

}
