import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];

			if (map.containsKey(num) && Math.abs(i - map.get(num)) <= k) return true;

			map.put(num, i);
		}

		return false;
	}
}