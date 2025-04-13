package Lecture_05;

import java.util.HashMap;

public class Longest_Substring_With_Atmost_K_unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabaaaa";
		int k=2;
		int si=0;
		int ei=0;
		int ans=0;
		HashMap<Character,Integer> map=new HashMap<>();
		while(ei<s.length()) {
			char ce=s.charAt(ei);
			if(map.containsKey(ce)) {
				int f=map.get(ce);
				map.put(ce, f+1);
			}
			else {
				map.put(ce, 1);
			}
			
			while(map.size()>k && si<ei) {
				char cs=s.charAt(si);
				int f=map.get(cs);
				map.put(cs, f-1);
				if(map.get(cs)==0) {
					map.remove(cs);
				}
				si++;
			}
			
			ans=Math.max(ans,ei-si+1);
			
			ei++;
		}
		System.out.println(ans);
	}

}
