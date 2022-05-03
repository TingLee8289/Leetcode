package leetcode;

public class Pow {

	public static void main(String[] args) {
//		double x = 2.00000;	int n = 10; // 1024.00000
		double x = 2.00000;	int n = -2; // 0.25000
//		double x = 2.10000;	int n = 3; // 9.26100
		System.out.println(myPow(x, n));

	}

	public static double myPow(double x, int n) {
		double result = 1;
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			for (int i = 1; i <= n; i++) {
				result *= x;
			}
			return result;
		} else {
			for (int i = 1; i <= -n; i++) {
				result *= x;
			}
			return 1/result;
		}

	}

}
