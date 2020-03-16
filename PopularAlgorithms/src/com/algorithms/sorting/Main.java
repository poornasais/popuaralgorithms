package com.algorithms.sorting;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] lists = {2,5,6,7,1,0,9,11,31,2,6,4,6};
		//System.out.println(linearSearch((new int[] {2, 4,2,5,7,9,3}), 4));
		System.out.println(binarySearch(lists, 31));
		
	}
	
	public static int linearSearch(int[] lists, int searchFor) {
		// linear search looks into every single order from the start to the end.
		
		for(int i = 0; i< lists.length;i++) {
			if(searchFor == lists[i]) {
				return i + 1;
			}
		}
		
		
		return -1;
	}

	
	private static int binarySearch(int[] lists, int searchItem) {
		//binary search works on divide and conquer. The list should be sorted else we cannot performe the binary search operations.
		Arrays.sort(lists);
		int p =0; // first value
		int r = lists.length-1; // final value
		int q =0;
		
		while(p<=r) {
			q = (p+r)/2;
			if(lists[q]==searchItem) {
				return q;
			}else if(searchItem > lists[q]) {
				p = q +1;
			}else if(searchItem < lists[q]){
				r = q-1;
			}
			
		}
		
		return -1;
	}
}
