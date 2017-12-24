package Divide_and_conquer;

public class A1_maximum_subarray_sum {
	
	
	
	
	private static class Node{
		int lSuffix;
		int rPrefix;
		int subArraySum;
		
		Node(){
			this.lSuffix=0;
			this.rPrefix=0;
			this.subArraySum=0;
		}
	}
	
	public static void main(String[] args) {
		int arr[]=new int[10];
		max(arr,new Node(),0,arr.length-1);
	}

	private static void max(int[] arr, Node node,int start,int end) {
		// TODO Auto-generated method stub
		
	
		if(end==1 || end==2){
			
			//left suffix
			int CS=0;
			for(int i=end;i>=start;i--){
				CS+=arr[i];
				
				if(CS>node.lSuffix){
					node.lSuffix=CS;
				}
				
			}
			
			
			//right prefix
			CS=0;
			for(int i=start;i<end;i++){
				CS+=arr[i];
				
				if(CS>node.rPrefix){
					node.rPrefix=CS;
				}
			}
			
			//subarray max
			CS=0;
			for(int i=start;i<end;i++){
				CS+=arr[i];
				if(CS<0){
					CS=0;
				}
				
				if(CS>node.subArraySum){
					node.subArraySum=CS;
				}
			}
			
			
		}
		
		//
		int m=(start+end)/2;
//	return	Math.max((max(arr,node,start,m)[0]+max(arr,node,m+1,end)[1]),max(arr,node,start,m)[2],max(arr,node,m+1,end).subArray
		
		
		
	}



}
