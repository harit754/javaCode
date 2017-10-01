package Math;



//link ::: http://www.geeksforgeeks.org/square-root-of-an-integer/
public class sqRoot_by_BinarySearch {
	
	
	static int mid=0;
	public static int sqroot(int start,int end,int x){
//		int mid=0;
		while(start<=end){
			 mid=(start+end)/2;
//			 System.out.println(mid);
			
			if(mid*mid==x){
				return mid;
			}else if(mid*mid<x){
				return sqroot(mid+1,end,x);
			}else{
				return sqroot(start,mid-1,x);
			}
			
		}
		return mid;
	}
	
	
	public static void main(String[] args) {
		
	int ans=	sqroot(0,26,34);
	System.out.println(ans);
		
	}

}
