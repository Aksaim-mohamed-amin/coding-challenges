import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int start = 0, end = numbers.length - 1;

		while (start < end) {
			int sum = numbers[start] + numbers[end];
			if (sum == target) {
				return new int[]{start + 1, end + 1};
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}

		return new int[]{};
	}
}