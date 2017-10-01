package sorting;

public class quickSort {

	//wrong
	public static int partition(int[] arr,int s,int e){
		//pivot element
		int x=arr[e];
		int i=s-1;
		int j=e+1;

		while(true){
			do{
				j--;
			}while(arr[j]>x);

			do{
				i++;
			}while(arr[i]<x);

			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}else{
				return j;
			}
		}
	}
	
	//
	public static int partition1(int[] arr,int s,int e){
		//pivot element (last element)
		int pivot=arr[e];
		//beginning of array
		int i=s-1;
		for(int j=s;j<=e-1;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			printArray(arr);
		}
		int temp=arr[i+1];
		arr[i+1]=arr[e];
		arr[e]=temp;
		
		printArray(arr);
		System.out.println("byee");
		
		return i+1;
	}
	
	
	public static void quicksort(int [] arr,int s,int e){
		if(s<e){
			int q=partition2(arr,s,e);
			quicksort(arr, s, q-1);
			quicksort(arr,q+1,e);
			printArray(arr);
//			printArrayLimit(arr,s,e);
			
			
		}else{
			return;
		}
	}
	
	private static void printArrayLimit(int[] arr,int s,int e){for(int i=s;i<=e;i++){
		System.out.print(arr[i]);
        System.out.print(" ");
        
	}
    System.out.println();}
	
	 private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	
	 
	 
	 //use quicksort
	 //when pivot element is at starting of the array
	 
	 public static int partition2(int[] arr,int s,int e){
			int pivot=arr[s];
			int i=e+1;
			for(int j=e;j>=s+1;j--){
				if(arr[j]>=pivot){
					i--;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				//printArray(arr);
			}
			int temp=arr[i-1];
			arr[i-1]=arr[s];
			arr[s]=temp;
			
//			printArray(arr);
			//System.out.println("byee");
			
			return i-1;
		}
	 
	 
	 
	 
	 
	 
	 public static int partitionCountShifts(int[] arr,int s,int e){
			//pivot element (last element)
		 int count=0;
			int pivot=arr[e];
			//beginning of array
			int i=s-1;
			for(int j=s;j<=e-1;j++){
				if(arr[j]<=pivot){
					i++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					count++;
				}
//			printArray(arr);
			}
			int temp=arr[i+1];
			arr[i+1]=arr[e];
			arr[e]=temp;
			count++;
			
//			printArray(arr);
//			System.out.println("byee");
			
			return count;
		}
	 
	public static void main(String[] args) {
		int [] arr={1,3,9,8,2,7,5};
		int l=arr.length;
		int[] arr1={5,8,6,10};
//		partition1(arr1, 1, 2);
		
int ans=	partitionCountShifts(arr, 0, l-1);
//	System.out.println(ans);
//		quicksort(arr,0,l-1);
//		printArray(arr);

		System.out.println(ans);
		
		
	}

}
