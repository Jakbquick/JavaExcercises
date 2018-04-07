public class DoubloonChecker {
	public static boolean isDoubloon(String s) {
		s = s.toUpperCase();
		int[] letterArray = new int[26];
		for (int i = 0; i < s.length(); i++) {
			letterArray[(s.charAt(i)) - 65]++;
		}
		// System.out.print(Arrays.toString(letterArray));
		for (int i = 0; i < letterArray.length; i++) {
			if (letterArray[i] != 0 && letterArray[i] != 2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println(isDoubloon("Emmett"));
	}
}
