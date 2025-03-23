import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int k = removeElement(nums, 2);
		System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
	}

	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0) return 0;

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) nums[k++] = nums[i];
		}

		return k;
	}
}