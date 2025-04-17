package Lecture_07;
import java.util.*;
public class top_K_frequent_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] topKFrequent(int[] arr, int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			if(map.containsKey(i)) {
				int f=map.get(i);
				map.put(i,f+1);
			}
			else {
				map.put(i, 1);
			}
		}
		PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<pair>() {
			public int compare(pair p1,pair p2) {
				return p2.freq-p1.freq;
			}
		});
		for(int i:map.keySet()) {
			pq.add(new pair(i,map.get(i)));
		}
		int idx=0;
		int [] ans=new int[k];
		while(k-->0) {
			ans[idx++]=pq.poll().val;
		}
		return ans;
	}

}
class pair{
	int freq;
	int val;
	pair(int v ,int f){
		val=v;
		freq=f;
	}
}
