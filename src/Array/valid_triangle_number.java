package Array;

import java.util.Arrays;

public class valid_triangle_number {
	
	
	
	
	
	
	public static int counting(int[] arr){
		Arrays.sort(arr);
		int l=arr.length;
		int count=0;
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				for(int k=j+1;k<l;k++){
					if(arr[k]>=arr[j]){
						if((arr[i] + arr[j] )>arr[k]){
							count++;
						}
					}
				}
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		int [] arr={2,2,3,4};
		int ans=counting(arr);
		System.out.println(ans);
	}
	

	
}
