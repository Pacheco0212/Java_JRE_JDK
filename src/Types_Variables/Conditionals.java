package Types_Variables;

public class Conditionals {

	public static void main(String[] args) {

		int age = 17;
		int peopleQuantity = 2;
		
		boolean couple = peopleQuantity > 1;
		boolean canEnter = (age >= 18 && couple);

		if (canEnter) {
			System.out.println("You are allowed to enter");
		} else {
			System.out.println("You are not allowed to enter");
		}

	}

}
