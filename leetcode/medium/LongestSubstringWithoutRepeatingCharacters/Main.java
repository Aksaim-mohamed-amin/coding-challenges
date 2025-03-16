import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		String s = "aab";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		Set<Character> substring = new HashSet<>();
		int left = 0, maxLength = 0;

		for (int right = 0; right < s.length(); right++) {

			while (substring.contains(s.charAt(right))) {
				substring.remove(s.charAt(left));
				left++;
			}

			substring.add(s.charAt(right));
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}
}