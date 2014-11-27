package sort.impl;

import java.util.List;

import sort.Sorter;

public class BubbleSort2 implements Sorter {
	public void sort(List<Integer> originalList){
		for(int i = 0;i < originalList.size();i++){
			for(int j = i;j<originalList.size();j++){
				if(originalList.get(i)>originalList.get(j)){
					int temp;
					temp = originalList.get(i);
					originalList.set(i, originalList.get(j));
					originalList.set(j, temp);
				}
			}
		}
	}
	
	
	
}
