import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 0;
		System.out.println("Please enter your age.");
		
		//taking the user input
		Scanner scan = new Scanner (System.in);{
			
			age = scan.nextInt();
			
			if(age<= 18) {
				System.out.println("Your balls haven't droppes yet, kindly fuck off.");
			
			} else if ((age > 18 && age <= 21)) {
				System.out.println("You probably make TikToks on your free time.");
			
			} else {
				System.out.println("You probably dont have a job.");
		  }
		}
	  }
	}
