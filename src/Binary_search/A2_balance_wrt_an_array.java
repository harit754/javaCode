package Binary_search;

import java.util.Scanner;

public class A2_balance_wrt_an_array {
	
	
	
	//yayy i have found my mistake
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			int k=s.nextInt();
			
			boolean ans=check(arr,k,0,arr.length-1);
			if(ans){
				System.out.println("Balanced");
			}else{
				System.out.println("Not Balanced");
			}
//			System.out.println(ans);
			
			
			t--;
		}
	}

	private static boolean check(int[] arr, int k, int s, int e) {
		// TODO Auto-generated method stub
		int m=(s+e)/2;
		if(k==arr[m] || k==arr[m+1]){
			System.out.println("found");
			return true;
		}
		if(s==e){
			System.out.println("end");
			return true;
		}
		
		
		if(arr[m]<=k && k<=arr[m+1]){
			System.out.println("h1");
			return Math.abs(arr[m]-k)==Math.abs(arr[m+1]-k) ?true:false;
		}else if(arr[m+1]<=k){
			System.out.println("h2");
			return check(arr,k,m+1,e);
		}else{
			System.out.println("h3");
			return check(arr,k,s,m);
		}
		
//		return false;
	}

}
