package Binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class B1_Aggressive_cows {
	
	
	
	//yayy running majja aa gya
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		while(t>0){
			int N=s.nextInt();
			int C=s.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++){
				arr[i]=s.nextInt();
			}
			
			//binary search
			//search space...--->0---->maximum distance
			//to find largest minimum distance
			Arrays.sort(arr);
			int ans=find(arr,C,0,arr[N-1]);
			System.out.println(ans);
			
			
			
			t--;
		}
	}

	private static int find(int[] arr, int cows, int s, int e) {
		// TODO Auto-generated method stub
		if(s>=e){
			return e-1;
		}
		int middle=(s+e)/2;
		//check if middle is possible or not
		boolean ans=check(arr,middle,cows);
		
		if(ans){
			//move right
			return find(arr,cows,middle+1,e);
		}else{
			//move left
			return find(arr,cows,s,middle);
		}
		
//		return 0;
	}

	
	//validating function
	private static boolean check(int[] arr, int ans, int cows) {
		// TODO Auto-generated method stub
		int counter=0;
		int current=arr[0];
		counter++;
		
		int next=0;
		for(int i=1;i<arr.length;i++){
			next=arr[i];
			if(next-current>=ans){
				counter++;
				current=next;
				continue;
			}
		}
		
		if(counter>=cows){
			return true;
		}else{
			return false;
		}
		
//		return false;
	}

}
