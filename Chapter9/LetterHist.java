
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
