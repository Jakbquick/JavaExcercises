
public class Abecedarian {
	public static boolean isAbcedarian(String s) {
		if (s.length() == 2) {
			return s.charAt(0) < s.charAt(1);
		} else {
			return s.charAt(0) < s.charAt(1) && isAbcedarian(s.substring(1));
		}
	}

	public static void main(String args[]) {
		System.out.println(isAbcedarian("abdebt"));
	}
}
