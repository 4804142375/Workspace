import java.util.Scanner;

public class splash {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++){
			int v = scan.nextInt();
			int p = scan.nextInt();
			
			System.out.println(v*p);
		}

	}

}
