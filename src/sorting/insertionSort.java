package sorting;

public class insertionSort {
	
	//running time order of n square
	//not efficient
	
	public static void insertion(int[] arr){
		int countShifts=0;
		int n=arr.length;
		int key;
		int i;
		for(int j=1;j<n;j++){
			key=arr[j];
			//insert this key into the sorted array that is arr[0,j-1]
			i=j-1;
			while(i>=0 && arr[i]>key){
				//swapping
				countShifts++;
				arr[i+1]=arr[i];
				arr[i]=key;
				i--;
			}
		}
		System.out.println(countShifts);
		
	}
	//insert element "key" in already sorted array arr
	public static void insertion1(int[] arr){
//		int countShifts=0;
		
		int n=arr.length;
		
		int key;
		int i;
		
			key=arr[n-1];
			//insert this key into the sorted array that is arr[0,j-1]
			i=n-2;
			while(i>=0 && arr[i]>key){
				//swapping
//				countShifts++;
				arr[i+1]=arr[i];
//				arr[i]=key;
				i--;
				
				for(int j:arr){
					System.out.print(j);
					System.out.print(" ");
					System.out.println();
				}
			}
			arr[i+1]=key;
			for(int j:arr){
				System.out.println(j);
				System.out.print(" ");
			}
		
//		System.out.println(countShifts);
		
	}
	
	public static void insertion2(int[] arr){
//		int countShifts=0;
		int n=arr.length;
		int key;
		int i;
		for(int j=1;j<n;j++){
			key=arr[j];
			//insert this key into the sorted array that is arr[0,j-1]
			i=j-1;
			while(i>=0 && arr[i]>key){
				//swapping
//				countShifts++;
				arr[i+1]=arr[i];
				arr[i]=key;
				i--;
				printArray(arr);
			}
			/*if(arr[i]<=key){
				printArray(arr);
			}*/
		}
//		System.out.println(countShifts);
		
	}
	
	//optimised solution have to find 
	//advanced problem
	public static void insertionCountShifts(int[] arr){
		int countShifts=0;
		int n=arr.length;
		int key;
		int i;
		for(int j=1;j<n;j++){
			key=arr[j];
			//insert this key into the sorted array that is arr[0,j-1]
			i=j-1;
			while(i>=0 && arr[i]>key){
				//swapping
				countShifts++;
				arr[i+1]=arr[i];
				arr[i]=key;
				i--;
			}
		}
		System.out.println(countShifts);
		
	}
	
	 private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	
	public static void main(String[] args) {
		int [] arr={1,4,3,5,6,2};
		insertion2(arr);
		
		
		
		
	}

}
