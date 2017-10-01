package Array;

public class ArrayEqIndex {
	
	//TLE?????????????????????? in one case
	
	public static int sum(int[] arr,int s,int e){
		int l=arr.length;
		int sum=0;
		for(int i=s;i<=e;i++){
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static int eqIndex(int[] arr){
		int l=arr.length;
		for(int i=1;i<l-1;i++){
			if(sum(arr,0,i-1)==sum(arr,i+1,l-1)){
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,4,2,1};
		int ans=eqIndex(arr);
		System.out.println(ans);

		int b=23;
		long a=25+b;
	}

}
