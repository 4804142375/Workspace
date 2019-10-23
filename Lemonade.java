import java.util.Scanner;

public class Lemonade {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.println("How many glasses of lemonade do you want?");
		double cost = 1.50;
		int count = scan.nextInt();
		double total = cost*count;
		
		if (total < 0){
			System.out.print("Enter a valid number, please.");
		}
		else {
			System.out.printf("You owe $%.2f" , total);
		}
	}
}
