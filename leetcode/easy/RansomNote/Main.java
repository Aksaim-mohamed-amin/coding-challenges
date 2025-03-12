import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String str = "test";
		String s = "tesq";
		System.out.println(canConstruct(str, s));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> letters = new HashMap<>();

		for (char c : magazine.toCharArray()) {
			letters.put(c, letters.getOrDefault(c, 0) + 1);
		}

		for (char c : ransomNote.toCharArray()) {
			if (!letters.containsKey(c) || letters.get(c) == 0) return false;
			letters.put(c, letters.get(c) - 1);
		}

		return true;
	}
}