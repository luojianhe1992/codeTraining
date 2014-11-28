package sort.impl;

import java.util.ArrayList;
import java.util.List;

import sort.Sorter;

public class RadixSort implements Sorter{

	@Override
	public void sort(List<Integer> arrayList) {
		// TODO Auto-generated method stub
		
		boolean finish = false;
		
		List<Integer> bits = new ArrayList<Integer>();
		
		//
		for(int i = 0;i < arrayList.size();i++){
			bits.add(arrayList.get(i)%10);
		}
		
		System.out.println("bits is:"+bits);
		
		int count_pow = 1;
		
		int pow = 0;
		
		while (!finish){
			
			
			
			//
			for(int i=0;i<bits.size();i++){
				for(int j=i;j<bits.size();j++){
					if(bits.get(i)>bits.get(j)){
						
						//
						int tempBit;
						tempBit = bits.get(i);
						bits.set(i, bits.get(j));
						bits.set(j, tempBit);
						
						//
						int tempSort;
						tempSort = arrayList.get(i);
						arrayList.set(i, arrayList.get(j));
						arrayList.set(j, tempSort);
					}
				}
			}
			
			System.out.println("bits is:"+bits);
			System.out.println("arrayList is:"+arrayList);
			
			pow = (int) Math.pow(10,count_pow);
			
			//
			for(int i=0;i<bits.size();i++){
				bits.set(i, (arrayList.get(i)/pow));
			}
			
			count_pow++;
			
			
			System.out.println("bits is:"+bits);
			
			int count = 0;
			
			for(int i=0;i<bits.size();i++){
				if(bits.get(i) == 0){
					count++;
				}
			}
			
			if(count == bits.size()){
				finish = true;
			}
			
			System.out.println("finish is:"+finish);
			
			
			
		}
		
		
		
	}

}
