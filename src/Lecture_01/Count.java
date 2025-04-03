package Lecture_01;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		count(n);
		count2(n,1);
	}

	private static void count2(int n, int i) {
		// TODO Auto-generated method stub
		if(i>n) {
			return;
		}
		System.out.println(i);
		count2(n,i+1);
	}

	private static void count(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		count(n-1);
		System.out.println(n);
	}

}
