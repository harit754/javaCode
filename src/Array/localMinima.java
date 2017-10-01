package Array;

public class localMinima {
	
	public static void printMinima(int[] arr) {
		// Write your code here
		int l=arr.length;
		for(int i=1;i<l-1;i++){
			if(arr[i]<arr[i-1] &&arr[i]<arr[i+1]){
				System.out.print(i);
			}
		}
		
		if(arr[0]<arr[1]){
			System.out.print(0);
		}
		if(arr[l-1]<arr[l-2]){
			System.out.print(l-1);
		}
		
	}
}
