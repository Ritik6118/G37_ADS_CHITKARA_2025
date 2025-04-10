package Lecture_04;
import java.util.*;

public class Letter_Combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits="23";
		List<String> ans=solve(digits);
		System.out.println(ans);
	}
	static String [] arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	private static List<String> solve(String digits) {
		// TODO Auto-generated method stub
		List<String> ans=new ArrayList<>();
		solution(digits,ans,""); 
		return ans;
		
	}
	private static void solution(String digits, List<String> ans,String s) {
		// TODO Auto-generated method stub
		if(digits.length()==0) {
			ans.add(s);
			return;
		}
		int idx=digits.charAt(0)-'0';//2
		String key=arr[idx];
		for(int i=0;i<key.length();i++) {
			solution(digits.substring(1),ans,s+key.charAt(i));
		}
		
	}

}
