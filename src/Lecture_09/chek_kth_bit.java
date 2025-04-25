package Lecture_09;

public class chek_kth_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int k=2;
//		if(((n>>k)&1)!=0) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
		
		if(((1<<k)&n)!=0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
