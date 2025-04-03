package Lecture_02;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=subseq("abc","");
		System.out.println(n);
	}

	private static int subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return 1;
		}
		int a=subseq(s.substring(1),ans+s.charAt(0));
		int b=subseq(s.substring(1),ans);
		return a+b;
	}
//	private static void subseq(String s, String ans) {
//		// TODO Auto-generated method stub
//		if(s.length()==0) {
//			System.out.println(ans);
//			return;
//		}
//		subseq(s.substring(1),ans+s.charAt(0));
//		subseq(s.substring(1),ans);
//	}

}
