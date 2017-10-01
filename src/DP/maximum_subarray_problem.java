package DP;

import java.util.Scanner;

public class maximum_subarray_problem {
	
	
	public static int maxSum(int [] arr,int n){
		int max=arr[0];
		int max_ending_here=arr[0];
		
		
		for(int i=1;i<n;i++){
			max_ending_here=Math.max(arr[i], max_ending_here+arr[i]);
			
			max=Math.max(max,max_ending_here);
		}
		return max;
		
		
		
		
	}
	
	
	//non-contiguos
	
	public static int maxSum2(int[] arr,int n){
		
		int sum=0;
		int max=-100000;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]>0){
				sum +=arr[i];
			}
		}
		if(sum==0){
			return max;
		}
		return sum;
	}
	
	
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    String c=in.next();
    
    

    
while(t>0){
    int n=in.nextInt();
    int[] arr=new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    
    int ans=maxSum(arr,n);
    System.out.print(ans);
        System.out.print(" ");
    
    int ans2=maxSum2(arr,n);
    System.out.println(ans2);
    
    
    t--;
}}

}
