package sort.impl;

import java.util.List;

import sort.Sorter;

public class ChooseSort implements Sorter{

	@Override
	public void sort(List<Integer> arrayList) {
		// TODO Auto-generated method stub
		
		int minNum;
		
		int min;
		
		for(int i=0;i<arrayList.size();i++){
			
			minNum = i;
			
			min = arrayList.get(i);
			
			for(int j=i+1;j<arrayList.size();j++){
				if(min>arrayList.get(j)){
					min = arrayList.get(j);
					minNum = j;
				}
			}
			
			//
			if(i != minNum){
				int temp;
				temp = arrayList.get(minNum);
				arrayList.set(minNum, arrayList.get(i));
				arrayList.set(i, temp);
			}
				
			
		}
	}

}
