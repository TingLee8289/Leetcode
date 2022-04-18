
public class NineNine {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i < 6) {
				System.out.print(" ".repeat(9 - i) + "* ".repeat(i));
				System.out.println();

			} else {
				System.out.print(" ".repeat(i - 1) + "* ".repeat(10 - i));
				System.out.println();
			}
		}
	}

}
