import java.util.Scanner;

public class madLibs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Input a day of the work week.");
		String day = scan.nextLine();
		
		System.out.println("Input a name that starts with a \"K.\"");
		String name1 = scan.nextLine();
		
		System.out.println("Input a name that contains the letter \"e\"");
		String name2 = scan.nextLine();
		
		boolean endDay = day.endsWith("day");
		boolean firstName = name1.startsWith("K");
		boolean containName = name2.contains("e");
		if (endDay == true && firstName == true && containName == true){
			System.out.println("It's a " + day + " morning here at the office."
					+ "\nYour protoge, " + name1 + ", is at corporate... "
					+ "\nYou couldn't be happier."
					+ "\nYou are driving into the parking lot and you hit " + name2 + ""
					+ "\nOH NO!! You cracked their pelvis."
					+ "\nEveryone in the office now hates you.");
		}
		
		else{
			System.out.println("Your IQ is room temperature. You couldn't follow simple directions."
					+ "\nTry Again.");
		}

	}

}