package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class frequency_of_array_elements {
	public static int[] freq(int[] arr){
		int l=arr.length;
		
		
		int[] ans=new int[l];
		for(int i=0;i<l;i++){
			int k=arr[i];
			ans[k-1]++;
		}
		
		return ans;
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(9);
		list.add(12);
		list.add(3);
		list.sort(null);
		
		System.out.println(list.get(1));
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			int [] ans=freq(arr);
			
			for(int a:ans){
				System.out.println(a);
				
			}
			
			
			t--;
		}
}

}
