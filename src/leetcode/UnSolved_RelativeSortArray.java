// 2022/05/04 done
// Runtime: 5 ms, faster than 28.13% of Java online submissions for Relative Sort Array.
// Memory Usage: 42.4 MB, less than 67.48% of Java online submissions for Relative Sort Array.


package leetcode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class UnSolved_RelativeSortArray {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int[] arr2 = { 2, 1, 4, 3, 9, 6 }; // {2,2,2,1,4,3,3,9,6,7,19}
//		int[] arr1 = { 28,6,22,8,44,17 };
//		int[] arr2 = { 22,28,8,6 }; // {22,28,8,6,17,44};

		int[] resultArr = relativeSortArray(arr1, arr2);
		for (int elm : resultArr) {
			System.out.println(elm);
		}
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int elm : arr1) {
			if (!map.containsKey(elm)) {
				map.put(elm, 1);
			} else {
				map.put(elm, map.get(elm) + 1);
			}
		}

		int[] resultArr = new int[arr1.length];
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < map.get(arr2[i]); j++) {
				resultArr[count] = arr2[i];
				count++;
			}
			map.remove(arr2[i]);
		}

		
		
		// it.next() 需先將值存起來，不然值會跑掉!!!
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int num = it.next();
			int index = map.get(num);
			for (int k = 0; k < index; k++) {
				resultArr[count] = num;
				count++;
			}
		}

		return resultArr;

//		Sol.2 ArrayList
		// int[] -> List<Integer>???
//		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
//		List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
//		
//		ArrayList<Integer> elmList = new ArrayList<>();
//		ArrayList<Integer> rmnList = new ArrayList<>();
//
//		for (int elm2 : list2) {
//			for (int elm1 : list1) {
//				if (elm2 == elm1) {
//					elmList.add(elm1);
//					list1.remove(elm1);
//				}
//			}
//		}
//		
//		System.out.println(list1);
//		System.out.println(elmList);
//		Collections.sort(rmnList);
//		ArrayList<Integer> resultList = new ArrayList<>();
//		resultList.addAll(elmList);
//		resultList.addAll(rmnList);
//		int[] resultArr = resultList.stream().mapToInt(i -> i).toArray();
//		return resultArr;
	}
}
