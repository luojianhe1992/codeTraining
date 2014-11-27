package sort.impl;

import java.util.ArrayList;
import java.util.List;

public class MyMain {


	public static void main(String[] args){
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(0);
		
		System.out.println(arrayList);
		
		MergeSort2 mergeSort2 = new MergeSort2();
		
		mergeSort2.sort(arrayList);
		
		System.out.println(arrayList);
		
		
	}
}
