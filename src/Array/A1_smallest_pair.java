package Array;

import java.util.Arrays;
import java.util.Scanner;

public class A1_smallest_pair {
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
				
			}
			
			Arrays.sort(arr);
			
			System.out.println(arr[0]+arr[1]);
			
			t--;
			
		}
		
	}

}
