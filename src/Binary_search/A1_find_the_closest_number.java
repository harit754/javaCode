package Binary_search;

import java.util.Scanner;

public class A1_find_the_closest_number {



	//1. same algo as binary search

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int k=s.nextInt();
			int arr[]=new int[n];

			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}

			int ans=max(arr,k,0,arr.length-1);
			System.out.println(ans);
			t--;
		}
	}

	private static int max(int[] arr,int k, int s, int e) {
		// TODO Auto-generated method stub
		// Corner cases
		if (k <= arr[s])
			return arr[s];
		if (k >= arr[e])
			return arr[e];

		if((e-s)>=2){
			int middle=(s+e)/2;
			if(Math.abs(arr[middle]-k)<=Math.abs(arr[middle-1]-k) && Math.abs(arr[middle]-k)<Math.abs(arr[middle+1]-k)){
				//			System.out.println("h1");
				return arr[middle];
			}else if(Math.abs(arr[middle]-k)>Math.abs(arr[middle-1]-k)){
				//			System.out.println("h2");
				return max(arr,k,s,middle);
			}else{
				//			System.out.println("h3");
				return max(arr,k,middle+1,e);
			}
		}else{
			return 0;
		}

	}

}
