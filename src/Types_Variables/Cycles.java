package Types_Variables;

public class Cycles {

	public static void main(String[] args) {
		int counter = 0;
		int total = 0;
		int total2 = 0;

		while (counter <= 10) {
			System.out.println(counter);
			total = total + counter;
			counter += 1;
		}
		System.out.println(total);
		System.out.println("\n");
		
		for (int counter2=0; counter2 <= 10; counter2++) {
			System.out.println(counter2);
			total2 = total2 + counter2;
		}
		System.out.println(total2 + "\n\n");
		
		
		for (int i=1; i <= 10; i++) {
			for (int j=1; j <= 10; j++) {
				System.out.print(i*j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
