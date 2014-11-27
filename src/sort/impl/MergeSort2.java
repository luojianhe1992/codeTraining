package sort.impl;

import java.util.ArrayList;
import java.util.List;

import sort.Sorter;

public class MergeSort2 implements Sorter{

	List<Integer> finalList = new ArrayList<Integer>();
	
	//
	@Override
	public void sort(List<Integer> arrayList) {
		// TODO Auto-generated method stub
		
		//divide and conquer
		List<Integer> result = divideAndSort (arrayList, 0, arrayList.size()-1);
		
		arrayList.clear();
		
		arrayList.addAll(result);
	}
	
	
	//
	List<Integer> divideAndSort(List<Integer> arrayList, int begin, int end){
		
		List<Integer> sortList = new ArrayList<Integer>();
		
		//base case
		if(begin ==  end){
			sortList.add(arrayList.get(begin));
		}
		
		//base case
		else if(begin == end - 1){
			if(arrayList.get(begin) < arrayList.get(end)){
				//
				sortList.add(arrayList.get(begin));
				sortList.add(arrayList.get(end));
			}
			else if(arrayList.get(begin) > arrayList.get(end)){
				//swap
//				int temp;
//				temp = arrayList.get(begin);
//				arrayList.set(begin, arrayList.get(end));
//				arrayList.set(end, temp);
				
				//
				sortList.add(arrayList.get(end));
				sortList.add(arrayList.get(begin));
			}
			else if(arrayList.get(begin) == arrayList.get(end)){
				//
				sortList.add(arrayList.get(begin));
				sortList.add(arrayList.get(end));
			}
		}
		
		//not the base case
		else{
			
			int middlePosition;
			middlePosition = (begin + end)/2;
			System.out.println(middlePosition);
			
			//
			List<Integer> leftList = divideAndSort(arrayList,begin,middlePosition);
			List<Integer> rightList = divideAndSort(arrayList,middlePosition + 1,end);
			
			int left = 0;
			int right = 0;
			
			//merge process
			while (left < leftList.size()||right < rightList.size()){
				Integer lPointer = null;
				Integer rPointer = null;
				
				if(left < leftList.size()){
					lPointer = leftList.get(left);
				}
				if(right < rightList.size()){
					rPointer = rightList.get(right);
				}
				
				//all the left have been added to the sortList
				if(lPointer == null){
					sortList.add(rightList.get(right));
					right++;
				}
				
				//all the right have been added to the sortList
				else if(rPointer == null){
					sortList.add(leftList.get(left));
					left++;
				}
				
				else{
					if(leftList.get(left) <= rightList.get(right)){
						sortList.add(leftList.get(left));
						left++;
					}
					else{
						sortList.add(rightList.get(right));
						right++;
					}
				}
			}
		}
		
		System.out.println(sortList);
		return sortList;
		
	}
	
	

}
