package Lecture_10;

public class Subseq_using_bitmask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int n=s.length();
		for(int i=0;i<(1<<n);i++) {   // (1<<n)  -> Math.pow(2,n);
			
			String ans ="";
			for(int j=0;j<n;j++) {
				int mask=(1<<j);
				if((i&mask)!=0) {
					ans+=s.charAt(j);
				}
			}
			System.out.println(ans);
		}
		
	}		

}
