import java.util.*;

public class Main {
	public static void main(String[] args) {
		String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);

			map.putIfAbsent(sorted, new ArrayList<>());
			map.get(sorted).add(word);
		}

		return new ArrayList<>(map.values());
	}
}
