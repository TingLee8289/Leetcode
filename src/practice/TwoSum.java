package practice;
// 2022/04/03 done
// 一開始想用Arrays.binarysearch()，但是需要搭配sort()先將array排序後才可得到正確的結果
// 所以改用兩層迴圈的寫法

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TwoSum {

	public static void main(String[] args) {
//		int[] nums = { 3, 2, 3 };
//		int target = 6;
//		int[] nums = { 2, 7, 11, 15 };
//		int target = 9;
		int[] nums = { 3, 3 };
		int target = 6;
//		int[] nums = { 3, 2, 4 };
//		int target = 6;

		int[] output = twoSum(nums, target);
		System.out.println(output[0] + "," + output[1]);

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] output = new int[2];

		for (int i = 0; i < nums.length; i++) {

			int secElement = target - nums[i];

			for (int j = i + 1; j < nums.length; j++) {
				if (secElement == nums[j]) {
					output[0] = i;
					output[1] = j;
				}
			}

		}

		return output;

////		0. Prepare a map to collect possible candidate.
//		Map<Integer, Integer> map = new TreeMap<>();
//
////		1. Remove the elements that are larger than target.
//		for (int e : nums) {
//			if (e <= target) {
//				map.put(e, target - e);
//			}
//		}
//
//		int[] output = new int[2];
//
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> it = set.iterator();
//		while (it.hasNext()) {
//			Integer key = it.next();
//			Integer value = map.get(key);
//
//			if (Arrays.binarySearch(nums, key) >= 0 && Arrays.binarySearch(nums, value) >= 0) {
//				output[0] = Arrays.binarySearch(nums, key);
//				if (key == value) {
//					nums[Arrays.binarySearch(nums, key)] = 0;
//					System.out.println(nums[0] + "," + nums[1] + "," + nums[2]);
//					output[1] = Arrays.binarySearch(nums, value);
//					System.out.println(output[1]);
//				} else {
//					output[1] = Arrays.binarySearch(nums, value);
//				}
//				break;
//			}
//		}
//
//		return output;
	}

}
