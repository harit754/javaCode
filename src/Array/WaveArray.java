package Array;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
	
	public static void swap(ArrayList<Integer> list,int i,int j){
		int temp=list.get(i);
		list.set(i, list.get(i+1));
		list.set(i+1, temp);
		
	}

	
	public static void wave(ArrayList<Integer> a) {
	    Collections.sort(a);
//	    System.out.println(a);
	    ArrayList<Integer> list=new ArrayList<>();
	    int l=a.size();
	    for(int i=0;i<l-1;i+=2){
	    	swap(a,i,i+1);
	    }
	    System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(250);
		list.add(50);
		list.add(3);
		list.add(54);
//		swap(list,1,2);
//		System.out.println(list);
		wave(list);
	}
}
