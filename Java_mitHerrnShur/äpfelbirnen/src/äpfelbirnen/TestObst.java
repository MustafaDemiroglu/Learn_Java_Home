import java.util.Arrays;

public class TestObst {

	public static void main(String[] args) {
		Obst obstKorb[] = {new Apfel("rot", 6.7, 7), new Apfel("grün", 6.1 , 6.6), 
				           new Birne("grün",9,6), new Apfel("rot-grün", 6.4, 6.5), 
				           new Birne("gelb",11,6.5), new Apfel("hellrot", 7.3,7.5), 
				           new Birne("gelb",10,6.2), new Birne("grün",10,5.2), 
				           new Apfel("grün-gelb",7.8,8), new Apfel("gelb",8.2,8.4)};
		
		
		// System.out.println(obstKorb[2].compareTo(obstKorb[3])); // positive Zahl, also ist [2] größer		
		
		System.out.println("Unsortiertes Obst:");
		for (int i = 0; i < obstKorb.length; i++) {
			System.out.println(obstKorb[i]);
		}
		
		Arrays.sort(obstKorb);				
		
		System.out.println();
		System.out.println("Sortiertes Obst:");
		for (int i = 0; i < obstKorb.length; i++) {
			System.out.println(obstKorb[i]);
		}		
	}
}
