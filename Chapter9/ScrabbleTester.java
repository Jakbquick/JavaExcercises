
public class ScrabbleTester {
	public static boolean canSpell(String tiles, String word) {
		int[] tilesArray = letterHist(tiles);
		int[] wordArray = letterHist(word);
		int lettersNeeded = 0;
		for (int i = 0; i < wordArray.length; i++) {
			lettersNeeded = wordArray[i];
			if (lettersNeeded > tilesArray[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println(canSpell("quijibo", "zib"));
	}

	public static int[] letterHist(String str) {
		char[] characters = str.toUpperCase().toCharArray();
		int[] result = new int[26];
		for (char letter : characters) {
			if (letter >= 65 && letter <= 90) {
				result[letter - 65] += 1;

			}

		}
		return result;
	}
}
