import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int start = i + 1, end = nums.length - 1;

			if (i > 0 && nums[i] == nums[i - 1]) continue;

			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if (sum == 0) {
					res.add(Arrays.asList(nums[i], nums[start++], nums[end--]));
					while (start <  end && nums[start] == nums[start - 1]) start++;
					while (start <  end && nums[end] == nums[end + 1]) end--;
				} else if (sum < 0) {
					start++;
				} else {
					end--;
				}
			}
		}

		return res;
	}
}