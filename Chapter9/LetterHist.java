
public class LetterHist {
	public static void main(String args[]) {
		String example = "Banana";
		int[] letterArr = letterHist(example);
		char letterCnt = 'A';
		for (int i = 0; i<letterArr.length; i++) {
			System.out.println(letterCnt + "  " + letterArr[i]);
			letterCnt++;
		}
	}
	/**
	 * takes a string and returns an array from 0-25 with 0 being a and 25 being z. each time it encounters a letter in the string it adds one to the
	 * respective value
	 * @param s - String to be entered to count letters
	 * @return	array containing count of each letter
	 */
	public static int[] letterHist(String s) {
		int[] letterArray = new int[26];
		s = s.toUpperCase();
		for (int i = 0; i < s.length();i++) {
			int letterValue = ((int)s.charAt(i))-65;
			letterArray[letterValue]++;
		}
		return letterArray;
	}
}
