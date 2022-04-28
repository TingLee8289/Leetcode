package leetcode;

public class ValidPerfectSquare {

	public static void main(String[] args) {
//		int num = 16; // true
		int num = 14; // false
		System.out.println(isPerfectSquare(num));
	}

	
	
	public static boolean isPerfectSquare(int num) {
		Math.sqrt(4);
		if (num==1) {
			return true;
		}
		
		for (int i = 1; i <= num / 2; i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}
}
