package round_428;

import java.util.Scanner;

public class test {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int k=s.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		
//		int max=8;
		int count=0;
		int sum=0;
		int rem=0;
		for(int i=0;i<n-1;i++){
			if(sum<k){
				if(arr[i]<=8){
					sum +=arr[i];
					count++;
				}else{
					sum +=8;
					count++;
					rem+=arr[i]-8;
				} 
				
			}else{
				break;
			}
			
		}

		if(arr[n-1]+rem>=8){
			sum+=8;
			count++;
		}else{
			sum+=arr[n-1]+rem;
			count++;
		}
		
		if(sum<k){
			System.out.println(-1);
		}else{
			System.out.println(count);
		}
		
		
	}

}
