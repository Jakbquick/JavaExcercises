import java.util.Scanner;

public class BottlesTester {
	public static void main(String args[]) {
		System.out.println("Please enter a number of bottles of beer -->");
		Scanner in = new Scanner(System.in);
		int bottles = in.nextInt();
		recursive(bottles);
	}

	public static void sing(int bot) {
		System.out.println("" + bot + " bottles of beer on the wall,\n" + bot + " bottles of beer,");
	}

	public static void recursive(int bot) {
		if (bot == 0) {
			System.out.println("No bottles of beer on the wall,\nNo bottles of beer,");
			System.out.println(
					"ya' can't take one down, ya' can't pass it around, \n'cause there are no more bottles of beer on the wall.");
		} else {
			sing(bot);
			System.out.println("ya' take one down, ya' pass it around, ");
			if (bot != 1) {
				System.out.println("" + (bot - 1) + " bottles of beer on the wall,");
			}
			recursive(bot - 1);

		}
	}
}
