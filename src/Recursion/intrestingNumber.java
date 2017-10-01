package Recursion;

public class intrestingNumber {
	public static int firstDigit(int n){
		while(n>9){
			n=n/10;
		}
		return n;
	}
	public static int lastDigit(int n){
		return n%10;
	}
	
	public static int func(int n1,int n2){
		if(n2==n1){
			if(firstDigit(n2)==lastDigit(n2)){
				return 1;
			}else{
				return 0;
			}
		}
		
		if(firstDigit(n2)==lastDigit(n2)){
			return 1+func(n1,n2-1);
		}else
		return func(n1,n2-1);
		
		
	}
	public static void main(String[] args) {
		int ans=func(100,105);
		System.out.println(ans);
	}
	
	
	

	
}
