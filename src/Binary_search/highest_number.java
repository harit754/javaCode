package Binary_search;

import java.util.Scanner;

public class highest_number {
	
	
	
	//1. same algo as binary search
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			
			int ans=max(arr,0,arr.length-1);
			System.out.println(ans);
			t--;
		}
	}

	private static int max(int[] arr, int s, int e) {
		// TODO Auto-generated method stub
		int middle=(s+e)/2;
		if(arr[middle]>=arr[middle-1] && arr[middle]>=arr[middle+1]){
			return arr[middle];
		}else if(arr[middle]<=arr[middle-1]){
			return max(arr,s,middle);
		}else{
			return max(arr,middle+1,e);
		}
		
	}

}
