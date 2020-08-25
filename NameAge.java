import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		String firstName;
		String lastName;
		int age;
		
		
		System.out.println("Hello, please state your first name.");
		firstName = input.nextLine ();
		
		System.out.println("Now please state your last name");
		lastName = input.nextLine ();
		
		System.out.println("Lastly, please state your age");
		age = input.nextInt();
		
		System.out.println("The following person is " + firstName + " " + lastName + " who is " + age + " years of age");
	}
}

