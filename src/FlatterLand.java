import java.util.Scanner;

public class FlatterLand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of people:");
		int p = in.nextInt();
		System.out.println("Distance required:");
		int d = in.nextInt();
		System.out.println("Answer = " + (p-1)*d);
	}

}
