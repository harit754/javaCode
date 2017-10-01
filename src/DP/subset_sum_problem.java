package DP;

import java.util.Scanner;

public class subset_sum_problem {
	
	public static boolean find(int[] arr,int l,int sum){
		boolean[][] T=new boolean[l][sum+1];
		
		T[0][0]=true;
		T[0][arr[0]]=true;
		for(int i=1;i<l;i++){
			for(int j=0;j<=sum;j++){
				if(j<arr[i]){
					T[i][j]=T[i-1][j];
				}else{
					T[i][j]=T[i-1][j] || T[i-1][j-arr[i]];
				}
			}
		}
		
		return T[l-1][sum];
	}

	
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int [] arr={2,3,7,8,10};
		boolean ans=find(arr,5,5);
		System.out.println(ans);
		
	}
}
