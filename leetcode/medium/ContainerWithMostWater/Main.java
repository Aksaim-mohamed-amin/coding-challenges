public class Main {
	public static void main(String[] args) {
		int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println("The max area is: " + maxArea(height));
	}

	public static int maxArea(int[] height) {
		int start = 0, end = height.length - 1;
		int area = 0;

		while (start < end) {
			int h = Math.min(height[start], height[end]);
			area = Math.max(area, h * (end - start));

			while (start < end && height[start] <= h) {
				start++;
			}

			while (start < end && height[end] <= h) {
				end--;
			}
		}
		return area;
	}
}