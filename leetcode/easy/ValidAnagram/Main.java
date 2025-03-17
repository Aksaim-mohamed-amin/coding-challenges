import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String s = "rat", t = "car";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) return false;

		Map<Character, Integer> mapS = new HashMap<>();
		Map<Character, Integer> mapT = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char charS = s.charAt(i);
			char charT = t.charAt(i);

			mapS.put(charS, mapS.getOrDefault(charS, 0) + 1);
			mapT.put(charT, mapT.getOrDefault(charT, 0) + 1);
		}

		return mapS.equals(mapT);
	}
}
