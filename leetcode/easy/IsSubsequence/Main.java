public class Main {
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length()) return false;

		int i = 0, j = 0, sLen = s.length(), tLen = t.length();
		while (i < sLen && j < tLen) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}

		return i == s.length();
	}
}