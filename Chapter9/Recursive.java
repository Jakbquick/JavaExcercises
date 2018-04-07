
public class Recursive {
	public static char first(String s) {
		return s.charAt(0);
	}

	public static String rest(String s) {
		return s.substring(1);
	}

	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	public static int length(String s) {
		return s.length();
	}

	public static void main(String args[]) {
		String s = "coffee";
		// printString(s);
		// printBackwards(s);
		// System.out.println(reverseString(s));
		System.out.println(isPalindrome("otto"));
	}

	public static void printString(String s) {
		int initSize = length(s);
		for (int i = 0; i < initSize; i++) {
			System.out.println(first(s));
			s = rest(s);
		}
	}

	public static void printBackwards(String s) {
		if (length(s) == 1) {
			System.out.println(s);
		} else {
			printBackwards(rest(s));
			System.out.println(first(s));
		}
	}

	public static String reverseString(String str) {
		if (length(str) != 0) {
			return reverseString(rest(str)) + first(str);
		}
		return "";
	}

	public static boolean isPalindrome(String s) {
		if (length(s) == 1) {
			return true;
		}
		if (length(s) == 2) {
			return first(s) == first(rest(s));
		} else {
			return first(s) == first(reverseString(s)) && isPalindrome(middle(s));
		}
	}
}
