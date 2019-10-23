import java.util.Scanner;

public class antiAbsolute {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
				
		for(int i = 0; i < n; i++){
			
			int input = scan.nextInt();
			System.out.println("Integer #"+ (i + 1) + ": " + -Math.abs(input));
			
		}
		
	}

}
