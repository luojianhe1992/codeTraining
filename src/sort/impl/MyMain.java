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
		arrayList.add(88);
		arrayList.add(60);
		arrayList.add(42);
		arrayList.add(83);
		arrayList.add(73);
		arrayList.add(48);
		arrayList.add(85);
		
		System.out.println(arrayList);
		
		Sorter quickSort = new QuickSort();
		
		System.out.println("the result of the quick sort is:");
		quickSort.sort(arrayList);
		
		System.out.println(arrayList);
		
		
	}
}
