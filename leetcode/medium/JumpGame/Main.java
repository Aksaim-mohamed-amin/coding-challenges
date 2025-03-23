public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,0,1};
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		int maxReach = 0, len = nums.length;

		for (int i = 0; i < len; i++) {
			if (maxReach < i) return false;
			maxReach = Math.max(maxReach, i + nums[i]);
			if (maxReach >= len - 1) return true;
		}

		return true;
	}
}