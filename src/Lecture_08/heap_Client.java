package Lecture_08;

public class heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap<Integer> pq=new Heap<>();
		pq.add(1);
		pq.add(4);
		pq.add(5);
		pq.add(3);
		pq.add(2);
		for(int i=0;i<5;i++) {
			System.out.println(pq.poll());
		}
		
	}

}
