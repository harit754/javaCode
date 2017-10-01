package DP;

public class longest_increasing_subsequence {

	
	//l---->length
	public static int find(int[] arr,int l){
		if(l==1){
			return arr[0];
		}
		
	if(arr[l-2]<=arr[l-1]){
		return find(arr,l-1)+arr[l-1];
	}else{
		return find(arr,l-1);
	}
	}
	
	
	
	//dp
	public static int find2(int[] arr,int l,int[] storage){
		if(l==1){
			storage[l]=arr[0];
			return storage[l];
		}
		
		if(storage[l]!=0){
			return storage[l];
		}
		
		
	if(arr[l-2]<=arr[l-1]){
		if(storage[l-1]!=0){
			return storage[l-1]+arr[l-1];
		}else{
			storage[l]=find2(arr,l-1,storage)+arr[l-1];
		}
		
//		return find2(arr,l-1)+arr[l-1];
	}else{
		if(storage[l-1]!=0){
			return storage[l-1];
		}else{
			storage[l]=find2(arr,l-1,storage);
		}
		
//		return find2(arr,l-1);
	}
	return storage[l];
	}
	
	
	
	public static void main(String[] args) {
		int[] arr={10,20,7,25,5};
		int ans=find(arr,5);
		System.out.println(ans);
		
		int [] storage=new int[6];
		int ans2=find2(arr,5,storage);
		System.out.println(ans2);
	}
}
