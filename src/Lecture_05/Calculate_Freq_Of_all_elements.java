package Lecture_05;

import java.util.HashMap;

public class Calculate_Freq_Of_all_elements {
	
	public static void main(String args[]) {
		int [] arr= {0,1,2,0,0,0,1,1,1,1,2,3,4,3,2,0,0};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			if(map.containsKey(i)) {
				// freq already kuch calculated hai
				int freq=map.get(i);
				map.put(i, freq+1);
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}
}
