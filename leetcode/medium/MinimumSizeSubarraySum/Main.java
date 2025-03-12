import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = new int[]{12,28,83,4,25,26,25,2,25,25,25,12};
		System.out.println(minSubArrayLen(213, nums));
	}

	public static int minSubArrayLen(int target, int[] nums) {
		int start = 0, minLength = Integer.MAX_VALUE, sum = 0;

		for (int end = 0; end < nums.length; end++) {
			sum += nums[end];

			while (sum >= target) {
				minLength = Math.min(minLength, end - start + 1);
				sum -= nums[start++];
			}
		}

		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}