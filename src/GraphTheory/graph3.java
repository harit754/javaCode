package GraphTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class graph3 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		ArrayList<ArrayList<Integer>> list=new ArrayList<>(v);
		
		for(int i=0;i<v;i++){
//			list.get(i)=new ArrayList<Integer>();
//			list.set(i, new ArrayList<Integer>());
		}
		int e=s.nextInt();
		while(e>0){
			int v1=s.nextInt();
			int v2=s.nextInt();
			list.get(v1).add(v2);
			list.get(v2).add(v1);
			
			
			
			e--;
		}
	}

}
