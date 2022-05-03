package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
		
		return null;
		
		
		
		
		
		

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
