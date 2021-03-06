package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sort.impl.BubbleSort;
import sort.impl.BubbleSort2;
import sort.impl.MergeSort;

public class SortMain {
	public static final int size = 1000;

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add(rand.nextInt());
		}
		
		System.out.println("array is:"+array);

//		Sorter sorter = new MergeSort();
		
		Sorter sorter = new BubbleSort2();
		

		sorter.sort(array);
		
		System.out.println("array is:"+array);

		boolean ordered = true;
		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i) > array.get(i + 1)) {
				ordered = false;
				break;
			}
		}
		if (array.size() != size)
			ordered = false;

		System.out.println(ordered);
	}
}
