
public class AnagramTester {
	public static boolean isAnagram(String s1, String s2) {
		char[] charachters1 = s1.toCharArray();
		int[] count1 = new int[26];
		char[] charachters2 = s2.toCharArray();
		int[] count2 = new int[26];
		for (char letter : charachters1) {
			if (letter >= 65 && letter <= 90) {
				count1[letter - 65]++;
			}
		}
		for (char letter : charachters2) {
			if (letter >= 65 && letter <= 90) {
				count2[letter - 65]++;
			}
		}
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i])
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println(isAnagram("stop", "pots"));
	}
}
