package sort.impl;

import java.util.ArrayList;
import java.util.List;

import sort.Sorter;

public class QuickSort implements Sorter {

	@Override
	public void sort(List<Integer> arrayList) {
		// TODO Auto-generated method stub
		
		quickSort(arrayList,0, arrayList.size()-1);
		
	}
	
	void quickSort(List<Integer> arrayList, int begin, int end){
		
		//base case
		if(begin == end){
			System.out.println(arrayList);
			
		}
		
		//base case
		else if(end - 1 == begin){
			if(arrayList.get(end) < arrayList.get(begin)){
				//swap
				int temp;
				temp = arrayList.get(begin);
				arrayList.set(begin, arrayList.get(end));
				arrayList.set(end, temp);
				System.out.println(arrayList);
			}
			else{
				System.out.println(arrayList);
			}
		}
		
		//divide and conquer
		else{
			int key = arrayList.get(begin);
			
			int i = begin;
			int j = end;
			
			//
			boolean right = true;
			boolean left = false;
			
			while(i != j){
				if(right&&(arrayList.get(j) <= key)){
					arrayList.set(i, arrayList.get(j));
					right = false;
					left = true;
					i++;
					System.out.println("i="+i);
					System.out.println("j="+j);
					System.out.println("arrayList is:"+arrayList);
					continue;
				}
				if(left&&(arrayList.get(i) > key)){
					arrayList.set(j, arrayList.get(i));
					left = false;
					right = true;
					j--;
					System.out.println("i="+i);
					System.out.println("j="+j);
					System.out.println("arrayList is:"+arrayList);
					continue;
				}
				if(right){
					System.out.println("j="+j);
					j--;
					System.out.println("j="+j);
					
				}
				if(left){
					System.out.println("i="+i);
					i++;
					System.out.println("i="+i);
				}
				System.out.println("i="+i);
				System.out.println("j="+j);
				System.out.println("the arrayList is:"+arrayList);
			}
			
			//the key value
			arrayList.set(i, key);
			
			//
			System.out.println("the arrayList is:"+arrayList);
			
			
			quickSort(arrayList,begin,i-1);
			quickSort(arrayList,i+1,end);
			
			System.out.print("the leftList is:{");
			for(int m=begin;m<=i-1;m++){
				System.out.print(arrayList.get(m)+",");
			}
			System.out.println("}");
			
			System.out.print("the rightList is:{");
			for(int n=i+1;n<=end;n++){
				System.out.print(arrayList.get(n)+",");
			}
			System.out.println("}");
			
		}
		
		
	}

	
}
