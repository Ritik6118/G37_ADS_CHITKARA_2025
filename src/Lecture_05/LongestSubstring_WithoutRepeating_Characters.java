package Lecture_05;

import java.util.*;

public class LongestSubstring_WithoutRepeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		HashMap<Character, Integer> map = new HashMap<>();
		int si = 0;
		int ei = 0;
		int ans = 0;
		while (ei < s.length()) {
			char ce = s.charAt(ei);
			if (map.containsKey(ce)) {
				int f = map.get(ce);
				map.put(ce, f + 1);
			} else {
				map.put(ce, 1);
			}

			while (map.get(ce) > 1 && si < ei) {
				char cs = s.charAt(si);
				int f = map.get(cs);
				map.put(cs, f - 1);
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		System.out.println(ans);
	}

}
