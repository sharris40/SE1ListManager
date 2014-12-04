package com.seproject.emailClientMgmtCore;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public List<String> mergeSort(List<String> l, boolean ascending){
	if(l.size() <=1)
		return l;
	
	List<String> left = new ArrayList<String>(), right = new ArrayList<String>(), result = new ArrayList<String>();
	
	int mid = l.size()/2;
	
	for(int x = 0; x < mid; x++){
		left.add(l.get(x));
	}
	
	for(int x = mid; x < l.size(); x++){
		right.add(l.get(x));
	}
	
	left = mergeSort(left, ascending);
	right = mergeSort(right, ascending);
	result = merge(left, right, ascending);
	
	
	return result;
	
}
	
	public List<String> merge(List<String> l, List<String> r, boolean ascending){
		List<String> result = new ArrayList<String>();
		int x = 0;
		int y = 0;
		boolean atEndX = false;
		boolean atEndY = false;
		boolean sortDone = false;
		
		while(!sortDone){
				int val = ascending ? l.get(x).substring(0, l.get(x).indexOf('@') - 1).compareTo(r.get(y)):
									  r.get(y).substring(0, r.get(y).indexOf('@') - 1).compareTo(l.get(x));
				if(val < 0){
					result.add(l.get(x));
					x++;
					atEndX = x >= l.size() ? true : false;
				}else if(val == 0){
					result.add(l.get(x));
					x++;
					atEndX = x >= l.size() ? true : false;
				} else if(val > 0) {
					result.add(r.get(y));
					y++;
					atEndY = y >= r.size() ? true : false;
				}
				
				if(atEndX){
					for(int i = y; i < r.size(); i++){
						result.add(r.get(i));
					}
					sortDone = true;
				} else if(atEndY){
					for(int i = x; i < l.size(); i++){
						result.add(l.get(i));
					}
					sortDone = true;
				}
			}

		return result;
	}
};
