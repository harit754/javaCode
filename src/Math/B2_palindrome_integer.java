package Math;

public class B2_palindrome_integer {
	
	public static void main(String[] args) {
		boolean ans=isPalindrome(12321);
		System.out.println(ans);
		
//		System.out.println(countDigits(1));
	}
	
	
	
	public static boolean isPalindrome(int n) {
		int count=countDigits(n);
//		int digit=ithDigit(n,2);
//		System.out.println(count);
//		System.out.println("n:"+n);
		for(int i=0;i<count/2;i++){
			if(ithDigit(n, i)!=ithDigit(n,count-1-i)){
//				System.out.println("n::"+n);
				return false;
			}
		}
		return true;
		
	}

	private static int ithDigit(int n,int i) {
		// TODO Auto-generated method stub
		
		n=(int) (n/(Math.pow(10.0, i*1.0)));
		n=n%10;
		
		return n;
	}

	private static int countDigits(int n) {
		// TODO Auto-generated method stub
		int counter=0;
		while(n>0){
			n=n/10;
			counter++;
		}
		return counter;
	}

}
