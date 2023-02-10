import java.util.Scanner;

public final class LateLarry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hours:");
		int w = in.nextInt();
		System.out.println("Minutes:");
		int n = in.nextInt();
		System.out.println("Time in mins taken:");
		int k = in.nextInt();
		int m = (w*60)+n;
		int stm = m -k;
		int mahr = stm%60;
		int hour = stm/60;
		System.out.println("Larry you need to leave at " + hour + ":" + mahr);
	}

}
