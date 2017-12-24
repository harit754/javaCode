package Math;

import java.util.ArrayList;

public class A7_prime_sum {
	
	//interwiew bit
	
	
	
	public static void main(String[] args) {
		System.out.println(primesum(28));
	}

	
public static ArrayList<Integer> sieve(int n) {
	    
	    int sieve[]=new int[n+1];
	    for(int i=0;i<=n;i++){
	    	sieve[i]=1;  //initailly all are primes ,say
	    }
	    sieve[0]=0;  //not prime
	    sieve[1]=0;
	    for(int i=2;i<Math.sqrt(n);i++){
	    	if(sieve[i]==1){
	    		for(int j=2;i*j<=n;j++){
	    			sieve[i*j]=0;  //multiple of i's are not prime
	    		}
	    	}
	    }
	    ArrayList<Integer> ans=new ArrayList<>();
	    
	    for(int i=2;i<=n;i++){
	    	if(sieve[i]==1){
	    		ans.add(i);
	    	}
	    	
	    }
	    
	    return ans;
	    
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
	 public static ArrayList<Integer> primesum(int n) {
		 ArrayList<Integer> list=sieve(n);
		 int l=list.size();
		 
		 int prime2=0;
		 int prime1;
		 ArrayList<Integer> ans=new ArrayList<>();
		 for(int i=0;i<l;i++){
			 prime1=list.get(i);
			 prime2=n-prime1;
			 System.out.println("prime2:"+prime2);
			 if(isPrime(prime2)==1){
				 System.out.println("hi");
				 ans.add(prime1);
				 ans.add(prime2);
				 return ans;
			 }
		 }
		 
		 return ans;
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	    }
}
