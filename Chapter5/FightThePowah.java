import java.util.Scanner;

public class FightThePowah {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a base number: ");
		double base = in.nextDouble();
		System.out.print("\nPlease enter a number to raise to: ");
		int pow = in.nextInt();
		System.out.println("\nYour result is: " + pow(base, pow));
	}

	public static double pow(double base, int pow) {
		if (pow == 0) {
			return 1;
		}
		else {
			return base * pow(base,pow-1);
		}
	}

}
