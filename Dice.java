import java.util.Scanner;
public class Dice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int die1 = (int)(Math.random()*6) + 1;
		
		System.out.println("Choose a number between 1 and 6. \nTry to match your number to the number rolled on the die.");
		
		int userInput = scan.nextInt();
		
		if(userInput > 6){
			System.out.println("Not Allowed!");
		}
		else if(userInput <= 0){
			System.out.println("Not Allowed!");
		}
		else if(die1 == userInput){
			System.out.println("The die had the number: "+ die1);
			System.out.println("You win!");
		}
		else{
			System.out.println("The die had the number: "+ die1);
			System.out.println("You lost. Try Again.");
		}

	}

}