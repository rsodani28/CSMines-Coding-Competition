import java.util.Scanner;

public class TallEnough {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of riders:");
		int n = in.nextInt();
		int[] h = new int[n];
		for (int i=0; i<h.length; i++) {
			System.out.println("Enter the heights:");
			int z = in.nextInt();
			h[i] = z;
		}
		for (int i = 0; i<h.length; i++) {
			if (h[i]<= 48) {
				System.out.println("False");
				if (i == h.length) {
					System.out.println("Done");} else {return;}
			} else {
				System.out.println("True");
			} 
			
		}
	}
}
