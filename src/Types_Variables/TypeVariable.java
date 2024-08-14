package Types_Variables;

public class TypeVariable {

	public static void main(String[] args) {
		
		System.out.println("Hello world!!");
		
		int age = 21; //integer
		double earnings = 2500.50; //numbers with decimals
		long test = 1222222222L; //big numbers
		short test2 = 13555;
		byte test3 = 20; //8 bits
		float test4 = 2.5f; 
		char letter = 'a'; //character
		String word = "My name is Eduardo";
		
		System.out.println("Age: " + age);
		System.out.println("Earnings: " + earnings);
		
		int cast = (int) earnings; //doing a variable conversion
		
		System.out.println(cast);
		
		System.out.println(letter);
		System.out.println(word);
	}

}
