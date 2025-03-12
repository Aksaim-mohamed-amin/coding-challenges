public class Main {
	public static void main(String[] args) {
		String str = ",'";
		System.out.println("The string \"" + str + (isPalindrome(str) ? "\" is palindrome." : "\" is Not palindrome."));
	}

	public static boolean isPalindrome(String s) {
		int start = 0, end = s.length() - 1;

		while (start < end) {
			while(start < end && !Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			}

			while (end > start && !Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			}

			if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}
}