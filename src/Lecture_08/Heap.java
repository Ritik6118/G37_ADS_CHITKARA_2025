package Lecture_08;
import java.util.*;
public class Heap<T extends Comparable>  {
	ArrayList<T> li;
	Heap(){
		li=new ArrayList<>();
	}
	private int parent(int idx) {
		return (idx-1)/2;
	}
	private int leftChild(int idx) {
		return (2*idx)+1;
	}
	private int rightChild(int idx) {
		return (2*idx)+2;
	}
	private void swap(int i,int j) {
		T temp=li.get(i);
		li.set(i, li.get(j));
		li.set(j, temp);
	}
	public void add(T val) {
		li.add(val);
		upheapify(li.size()-1);
	}
	private void upheapify(int i) {
		// TODO Auto-generated method stub
		if(i==0) {
			return;
		}
		int p=parent(i);
		if(li.get(i).compareTo(li.get(p)) < 0) {
			swap(i,p);
		}
		upheapify(p);
	}
	public T poll() {
		if(li.size()==0) {
			System.out.println("pq is empty");
			return null;
		}
		T temp=li.get(0);
		li.set(0, li.get(li.size()-1));
		li.remove(li.size()-1);
		if(li.size()>0) {
			downheapify(0);
		}
		return temp;
	}
	private void downheapify(int i) {
		// TODO Auto-generated method stub
		int min=i;
		int l=leftChild(i);
		int r=rightChild(i);
		if(l<li.size() && (li.get(min).compareTo(li.get(l)))>0) {
			min=l;
		}
		if(r<li.size() && (li.get(min).compareTo(li.get(r)))>0) {
			min=r;
		}
		if(i!=min) {
			swap(i,min);
			downheapify(min);			
		}
		
	}
	public int size() {
		return  li.size();
	}
	public T peek() {
		return li.get(0);
	}
	public boolean isEmpty() {
		return li.size()==0;
	}
}
