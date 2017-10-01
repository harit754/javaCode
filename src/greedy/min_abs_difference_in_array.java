package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class min_abs_difference_in_array {
	 public static void main(String[] args) {
		 String str="abbccdd";
		 
		 
		 
		 
		 System.out.println();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        // your code goes here
	        Arrays.sort(a);
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<n-1;i++){
	        	if(Math.abs(a[i]-a[i+1]) <min){
	        		min=Math.abs(a[i]-a[i+1]);
	        	}
	        }
	        System.out.println(min);
	    }
	 
	 
	 
	
	
	

}
