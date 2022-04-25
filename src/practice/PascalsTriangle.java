
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
// Memory Usage: 40 MB, less than 88.62% of Java online submissions for Pascal's Triangle.

package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int numRows = 5; // [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//		int numRows = 1; // [[1]]
//		generate(numRows);

	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> resultList = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			ArrayList<Integer> rowList = new ArrayList<>();
			rowList.add(0, 1);
			for (int j = 1; j <= i; j++) {
				rowList.add(j, (rowList.get(j - 1) * (i - j + 1) / j));
			}
			resultList.add(rowList);
		}

		return resultList;
	}

}
