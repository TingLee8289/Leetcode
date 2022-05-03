// 2022/05/03 done
// Runtime: 2 ms, faster than 38.16% of Java online submissions for Sort Array By Parity.
// Memory Usage: 43.3 MB, less than 78.03% of Java online submissions for Sort Array By Parity.


package leetcode;

import java.util.LinkedList;

public class SortArrayByParity {

	public static void main(String[] args) {

//		int[] nums = { 3, 1, 2, 4 };
		int[] nums = { 0 };
		int[] resultArr = sortArrayByParity(nums);
		for (int elm : resultArr) {
			System.out.println(elm);
		}

	}

	public static int[] sortArrayByParity(int[] nums) {

		// Sol.1 Brute Force
		LinkedList<Integer> list = new LinkedList<>();
		for (Integer i : nums) {
			if (i % 2 == 0) {
				list.addFirst(i);
			} else {
				list.addLast(i);
			}
		}
		
		// list<Integer> -> array: (1) list.toArray() -> Object[] (2) Iterator + Casting, intArr[i] = (Integer) objArr[i];
		Object[] objArr = list.toArray();
		int[] intArr = new int[objArr.length];
		for (int i = 0; i < objArr.length; i++	) {
			intArr[i] = (Integer) objArr[i];
		}
		
		
		return intArr;
	}

}
