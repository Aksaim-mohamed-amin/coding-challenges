public class Main {
	public static void main(String[] args) {
		int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int[] height2 = new int[]{4,2,0,3,2,5};
		System.out.println(trap(height));
		System.out.println(trap(height2));
	}

	public static int trap(int[] height) {
		int left = 0, right = height.length - 1;
		int maxL = height[left], maxR = height[right];
		int waterDrops = 0;

		while (left < right) {
			if (maxL < maxR) {
				left++;
				maxL = Math.max(maxL, height[left]);
				waterDrops += maxL - height[left];
			} else {
				right--;
				maxR = Math.max(maxR, height[right]);
				waterDrops += maxR - height[right];
			}
		}

		return waterDrops;
	}
}
