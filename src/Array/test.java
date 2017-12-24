package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	
	
//	static int index=0;
	
	public static void main(String[] args) {
		char c='0';
		int ans=c-'0';
		System.out.println(ans);
		
		
		
		
		
	}

	//divide and conquer
	private static int findMax(int[] workers,int s,int e) {
		// TODO Auto-generated method stub
		if(s==e){
			return workers[s];
		}
		
		if(findMax(workers,s,(s+e)/2)>findMax(workers,(s+e)/2+1,e)){
			return findMax(workers,s,(s+e)/2);
		}else{
			return findMax(workers,(s+e)/2+1,e);
		}
		
		
		
	}
}
