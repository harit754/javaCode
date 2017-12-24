package Math;

public class A1_check_primes {
	
	
	
	
	
	public static void main(String[] args) {
		int ans=isPrime(25);
		System.out.println(ans);
	}
	
	public static int isPrime(int a) {
	    if(a==1){
	        return 0;
	    }
	    if(a==2){
	        return 1;
	    }
	    for(int i=2;i<=Math.sqrt(a);i++){
	        if(a%i==0){
	            return 0;
	        }
	    }
	    
	    return 1;
	    
	}

}
