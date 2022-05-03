package practice;

public class recursionTest1 {

	public static void main(String[] args) {
//		p1(1234);
//		System.out.println(p2(10));
//		System.out.println(p3(10));
//		System.out.println(p4(10));
		p5(5, 'x', 'y', 'z');
//		p6();

	}

//	1. 按順序列印一個數位的每一位(例如 1234 列印出 1 2 3 4)
	public static void p1(int num) {
		if (num < 10) {
			System.out.print(num + " ");
			return;
		}
		p1(num / 10);
		System.out.print(num % 10 + " ");
	}

	public static void print(int n) {
		if (n > 9) {
			print(n / 10);
		}
		System.out.print(n % 10 + " ");

	}

//	2. 遞迴求 1 + 2 + 3 + … + 10

	public static int p2(int num) {

		if (num == 1) {
			return 1;
		}
		return num + p2(num - 1);

	}

//	3. 遞迴求 N 的階乘
	public static int p3(int num) {
		if (num == 1) {
			return 1;
		}
		return num * p3(num - 1);
	}

//	4. 求斐波那契數列的第 N 項
	public static int p4(int num) {

		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		}

		return p4(num - 1) + p4(num - 2);
	}

//	5. 實現程式碼:求解漢諾塔問題(提示, 使用遞迴）
	public static void p5(int layerNum, char x, char y, char z) {

		if (layerNum == 1) {
			move(x, z);
		} else {
			p5(layerNum - 1, x, z, y);
			move(x, z);
			p5(layerNum - 1, y, x, z);
		}

	}

	public static void move(char p1, char p2) {
		System.out.println(p1 + "->" + p2);
	}

//	6. 實現程式碼: 青蛙跳臺階問題(提示, 使用遞迴)
	public static void p6() {

	}

}
