import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";

		System.out.println(wordPattern(pattern, str));
	}

	public static boolean wordPattern(String pattern, String s) {
		String[] str = s.split(" ");
		if (str.length != pattern.length()) return false;

		Map<Character, String> characterToWord = new HashMap<>();
		Map<String, Character> wordToCharacter = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			String word = str[i];
			char c = pattern.charAt(i);

			if (characterToWord.containsKey(c)) {
				if (!characterToWord.get(c).equals(word)) return false;
			} else {
				characterToWord.put(c, word);
			}

			if (wordToCharacter.containsKey(word)) {
				if (wordToCharacter.get(word) != c) return false;
			} else {
				wordToCharacter.put(word, c);
			}
		}

		return true;
	}
}