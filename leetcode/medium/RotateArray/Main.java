import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
		rotate(nums, 3);
		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		k = k % len;

		revers(nums, 0, len - 1);

		revers(nums, 0, k - 1);

		revers(nums, k, len - 1);
	}

	public static void revers(int[] arr, int start, int end) {
		while (start < end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
	}
}