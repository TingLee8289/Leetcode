package leetcode;

public class Unsolved_DeleteColumnstoMakeSorted {

	public static void main(String[] args) {
//		String[] strs = { "cba", "daf", "ghi" }; // 1
//		String[] strs = { "a", "b" }; 				// 0
		String[] strs = { "zyx", "wvu", "tsr" }; // 3
		System.out.println(minDeletionSize(strs));
	}

	public static int minDeletionSize(String[] strs) {
		int sum = 0;
		int len = strs.length;
		int[][] arr = new int[len][len];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (strs[j].charAt(i) - strs[j].charAt(i + 1) > 0) {
					sum++;
					break;
				}

			}
		}
		return sum;

	}

}
