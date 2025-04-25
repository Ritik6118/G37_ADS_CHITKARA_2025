package Lecture_10;

public class reverse_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(Integer.toBinaryString(n));
		int ans=0;
		for(int pos=0;pos<32;pos++) {
			if((n&(1<<pos))!=0) {
				ans=ans|(1<<(31-pos));
			}
		}
		System.out.println(ans);
		System.out.println(Integer.toBinaryString(ans));
	}

}
