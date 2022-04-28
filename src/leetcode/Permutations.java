package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<>();
		recursion(resultList, nums, 0);
		return resultList;
	}

	public static void recursion(List<List<Integer>> resultList, int[] nums, int index) {
		if (index >= nums.length) {
			List<Integer> elementList = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				elementList.add(nums[i]);
			}
			resultList.add(elementList);
			return;
		}

		for (int i = index; i < nums.length; i++) {
			swap(nums, index, i);
			recursion(resultList, nums, index + 1);
			swap(nums, index, i);
		}
	}

	public static void swap(int[] num, int a, int b) {
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}

}
