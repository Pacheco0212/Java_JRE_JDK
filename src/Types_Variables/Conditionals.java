package Types_Variables;

public class Conditionals {

	public static void main(String[] args) {
		
		int age = 17;
		int quantity = 2;
		
		if(age >= 18) {
			System.out.println("You can enter");
		} else {
			if(quantity >= 2) {
				System.out.println("You are under-age but your entry is allowed");
			} else {
				System.out.println("You are not allowed to enter");
			}
		}
		
	}

}
