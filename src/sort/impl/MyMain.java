package sort.impl;

import java.util.ArrayList;
import java.util.List;

import sort.Sorter;

public class MyMain {


	public static void main(String[] args){
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(72);
		arrayList.add(6);
		arrayList.add(57);
		arrayList.add(880);
		arrayList.add(603);
		arrayList.add(42);
		arrayList.add(83);
		arrayList.add(732);
		arrayList.add(48);
		arrayList.add(851);
		
		System.out.println(arrayList);
		
		Sorter bucketSort = new BucketSort();
		
		System.out.println("the result of the quick sort is:");
		bucketSort.sort(arrayList);
		
		System.out.println(arrayList);
		
		
	}
}
