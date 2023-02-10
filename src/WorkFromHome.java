import java.util.Scanner;

public class WorkFromHome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Watts PC uses per min:");
		int w = in.nextInt();
		System.out.println("Number of minutes used for work:");
		int n = in.nextInt();
		System.out.println("Price in cents per kilowatt:");
		int k = in.nextInt();
		double kw = w/1000;
		double kwn = kw * (n/60);
		double r = Math.round((kwn * k)/100);
		System.out.println("Pay " + r + " cents.");
	} 

}
