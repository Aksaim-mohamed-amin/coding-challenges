import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String str = "   fly me   to   the moon  ";
		System.out.println("The length of the last word is: " + lengthOfLastWord(str));
	}

	public static int lengthOfLastWord(String s) {
		s = s.trim();
		return s.length() - s.lastIndexOf(" ") - 1;
	}
}