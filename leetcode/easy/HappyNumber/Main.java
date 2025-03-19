import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		int n = 19;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {
		Set<Integer> numbersSeen = new HashSet<>();

		while (n != 1 && !numbersSeen.contains(n)) {
			numbersSeen.add(n);
			n = getSumOfSquares(n);
		}

		return n == 1;
	}

	public static int getSumOfSquares(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		return sum;
	}
}