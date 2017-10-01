package Array;
import java.util.HashMap;

//ARRAY INTERSECTION USING HASHMAP (fastest method)
public class arrayIntersectionCount {
	public static int intersection(int[]arr1,int[] arr2){
		HashMap<Integer,Integer> map=new HashMap<>();
		int count=0;
		int l1=arr1.length;
		int l2=arr2.length;
		for(int i=0;i<l1;i++){
			/*if(map.containsKey(arr1[i])){
				count++;
			}*/
			map.put(arr1[i], arr1[i]);
			
		}
		for(int i=0;i<l2;i++){
			if(map.containsKey(arr2[i])){
				count++;
			}
			map.put(arr2[i], arr2[i]);
			
		}
		return count;
	}

	
	
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5};
		int[] arr2={1,2,3,8,9};
		System.out.println(intersection(arr1,arr2));
		
	}
}
