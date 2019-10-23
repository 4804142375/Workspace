import java.util.Scanner;

public class tooLongWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a word.");
		
		String word = scan.nextLine();
		
		int size = word.length();
		
		int middle = size - 2;
		
		String firstLetter = word.substring(0,1);
		
		String lastLetter = word.substring(size -1, size);
		
		if (size > 10){
			
			System.out.println(firstLetter + middle + lastLetter);
			
		}
		
		else{
			System.out.println(word);
		}

	}

}