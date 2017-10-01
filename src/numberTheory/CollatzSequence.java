package numberTheory;

public class CollatzSequence {
	
	public static int collatz(int n,int[] storage){
		if(n==1){
			storage[n]=0;
			return 0;
		}
		if(storage[n]!=0){
			return storage[n];
		}
		if(n%2==0){
		
			storage[n]=1+collatz(n/2,storage);
		}else{
			
			storage[n]=1+collatz(3*n+1,storage);
		}
		return storage[n];
	}
	
	
	public static void main(String[] args) {
		int [] storage=new int[100000000];
		int ans=collatz(100,storage);
		System.out.println(ans);
		
		long a=100;
	}
	
	
	
	
	
	
	
	

}
